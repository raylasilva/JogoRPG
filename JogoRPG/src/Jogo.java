import java.util.Random;
import java.util.Scanner;

// Classe que representa o jogo
class Jogo {
    private Jogador jogador; // Referência para o jogador
    private Inimigo inimigo; // Referência para o inimigo

    // Construtor que inicializa o inimigo
    public Jogo() {
        this.inimigo = new Inimigo("Volvagia", 100); // Cria um novo inimigo com 100 pontos de vida
    }

    // Método que inicia o jogo
    public void iniciarJogo() {
        exibirMenuInicial(); // Exibe o menu inicial
        selecionarHeroi(); // Permite ao jogador selecionar seu herói
        batalha(); // Inicia a batalha
    }

    // Método privado para exibir o menu inicial
    private void exibirMenuInicial() {
        System.out.println("====================================");
        System.out.println("| Bem-vindo ao Jogo de RPG Fantasia|");
        System.out.println("====================================");
        System.out.println("|                                  |");
        System.out.println("|        Escolha seu Herói:        |");
        System.out.println("|                                  |");
        System.out.println("|  1. Gandolf - O Mago             |");
        System.out.println("|  2. Aragon - O Guerreiro         |");
        System.out.println("|  3. Sair do Jogo                 |");
        System.out.println("|                                  |");
        System.out.println("====================================");
    }

    // Método privado para permitir ao jogador selecionar seu herói
    private void selecionarHeroi() {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.print("Escolha seu Herói: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    jogador = new Mago("Gandolf", 80, 150); // Cria um novo mago com 80 pontos de vida e 150 de mana
                    break;
                case 2:
                    jogador = new Guerreiro("Aragon", 100, 150); // Cria um novo guerreiro com 100 pontos de vida e 150 de energia
                    break;
                case 3:
                    System.out.println("Você saiu do jogo. Até logo!");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (escolha < 1 || escolha > 3);

        System.out.println("====================================");
        System.out.println("|     Você escolheu: " + jogador.getNome() + "     |");
        System.out.println("| Iniciando a batalha contra " + inimigo.getNome() + "!  |");
        System.out.println("====================================");
    }

    // Método privado para realizar a batalha
    private void batalha() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (jogador.estaVivo() && inimigo.estaVivo()) {
            exibirStatus(); // Exibe o status do jogador e do inimigo
            exibirMenuAcoes(); // Exibe o menu de ações disponíveis

            int acao = scanner.nextInt(); // Lê a ação escolhida pelo jogador

            switch (acao) {
                case 1:
                    jogador.atacar(inimigo, random); // Jogador ataca o inimigo
                    break;
                case 2:
                    jogador.defender(); // Jogador defende
                    break;
                case 3:
                    jogador.recuperarMana(); // Jogador recupera mana
                    break;
                default:
                    System.out.println("Ação inválida. Tente novamente.");
            }

            if (inimigo.estaVivo()) {
                inimigo.atacar(jogador, random); // Inimigo ataca o jogador
            }
        }

        exibirResultado(); // Exibe o resultado da batalha
    }

    // Método privado para exibir o status do jogador e do inimigo
    private void exibirStatus() {
        System.out.println("====================================");
        System.out.println("|   Vida do Jogador: " + jogador.getVida() + "             |");
        System.out.println("|   Mana do Jogador: " + jogador.getMana() + "             |");
        System.out.println("|   Vida do Inimigo: " + inimigo.getVida() + "             |");
        System.out.println("====================================");
    }

    // Método privado para exibir o menu de ações disponíveis
    private void exibirMenuAcoes() {
        System.out.println("====================================");
        System.out.println("|          Ações disponíveis        |");
        System.out.println("====================================");
        System.out.println("|  1. Atacar                       |");
        System.out.println("|  2. Defesa                       |");
        System.out.println("|  3. Recuperar Mana               |");
        System.out.println("====================================");
        System.out.print("Escolha sua ação: ");
    }

    // Método privado para exibir o resultado da batalha
    private void exibirResultado() {
        System.out.println("====================================");
        if (jogador.estaVivo()) {
            System.out.println("|   Você venceu o dragão " + inimigo.getNome() + "!   |");
        } else {
            System.out.println("|   Você foi derrotado pelo dragão " + inimigo.getNome() + "!   |");
        }
        System.out.println("====================================");
    }
}

