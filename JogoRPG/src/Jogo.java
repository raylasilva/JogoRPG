import java.util.Random;
import java.util.Scanner;

// Classe que representa o jogo
class Jogo {
    private Jogador jogador;
    private Inimigo inimigo;

    public Jogo() {
        this.jogador = new Jogador();
        this.inimigo = new Inimigo();
    }

    public void iniciarJogo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("  Bem-vindo ao Jogo de RPG Fantasia " );
        System.out.println("------------------------------------");
        System.out.println("Você se depara com um temível dragão!\nPrepare-se para a batalha!");
        System.out.println("====================================");
        System.out.println("|                                  |");
        System.out.println("|        Escolha seu Herói:        |");
        System.out.println("|                                  |");
        System.out.println("|  1. Gandolf - O Mago             |");
        System.out.println("|  2. Aragon - O Guerreiro         |");
        System.out.println("|  3. Sair do Jogo                 |");
        System.out.println("|                                  |");
        System.out.println("====================================");
        int escolha;
            do {
                System.out.print("Escolha seu Herói: ");
               escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("Gandolf");
                        break;
                    case 2:
                        System.out.println("Aragon");
                        break;
                    case 3:
                        System.out.println("Você saiu do jogo. Até logo!");
                        return;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha novamente.");
                }
            } while (escolha < 1 || escolha > 3);

        while (jogador.estaVivo() && inimigo.estaVivo()) {
            System.out.println("Escolha sua ação:");
            System.out.println("1. Atacar");
            System.out.println("2. Defender");
             escolha = scanner.nextInt();

            if (escolha == 1) {
                jogador.atacar(inimigo);
            } else if (escolha == 2) {
                jogador.defender();
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
                continue;
            }

            if (inimigo.estaVivo()) {
                inimigo.atacar(jogador);
            }
        }

        if (jogador.estaVivo()) {
            System.out.println("Parabéns! Você derrotou o temível dragão!");
        } else {
            System.out.println("Você foi derrotado pelo dragão! Game Over!");
        }
    }
}