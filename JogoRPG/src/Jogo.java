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
        System.out.println("Bem-vindo ao jogo RPG!");
        System.out.println("Você se depara com um temível dragão! Prepare-se para a batalha!");
        System.out.println("-------------------------------");

        while (jogador.estaVivo() && inimigo.estaVivo()) {
            System.out.println("Escolha sua ação:");
            System.out.println("1. Atacar");
            System.out.println("2. Defender");
            int escolha = scanner.nextInt();

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