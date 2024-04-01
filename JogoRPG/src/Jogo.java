import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// Classe que representa o jogo
public class Jogo {
    private Jogador jogador;
    private Inimigo inimigo;

    public Jogo() {
        this.jogador = new Jogador();
        this.inimigo = new Inimigo();
    }

    public void iniciarJogo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("====================================");
        System.out.println("  Bem-vindo ao Jogo de RPG Fantasia " );
        System.out.println("------------------------------------");
        System.out.println("Você chega a caverna do Volvagia, e terá que derrota-lo para salvar seu reino!\nPrepare-se para uma batalha épica!");
        System.out.println("                                                  |*~=-.,   ");
        System.out.println("                                                  |_,-'`    ");
        System.out.println("                                                  |         ");
        System.out.println("                                                 /^\\        ");
        System.out.println("                   !_                           /   \\       ");
        System.out.println("                   |*`~-.,                     /,    \\      ");
        System.out.println("                   |.-~^`                     /#    \\     ");
        System.out.println("                   |                        _/##_   _  \\_   ");
        System.out.println("             [ ]_[ ]_[ ]_[ ]_[ ]            |_=_-=_ - =_|   ");
        System.out.println("           |.-'|=     []     |   !_       |_.-   |    ");
        System.out.println("           |   |_=- -        |   |*`~-.,  |  |=_-      |    ");
        System.out.println("          /^  |=_= -        |   |_,-~`  /^\\ |_ - =[]  |    ");
        System.out.println("      _  /   \\_|_=- _   _   _|  _|  _   /   \\|=_-      |    ");
        System.out.println("     [ ]/,    \\[ ]_[ ]_[ ]_[ ]_[ ]_[ ]_/,    \\[ ]=-    |    ");
        System.out.println("      |/#     \\_=-___=__=__- =-_ -=_ /#     \\| _ []  |    ");
        System.out.println("     _/##_   _  \\_-_ =  _____       _/##_   _  _ -    |\\   ");
        System.out.println("    [ ]_[ ]_[ ]_[ ]=_0~{_ _ _}~0   [ ]_[ ]_[ ]_[ ]=-   | \\  ");
        System.out.println("    |_=__-_=-_  =_|-=_ |  ,  |     |_=-___-_ =-__|_    |  \\ ");
        System.out.println("     | _- =-     |-_   | ((* |      |= _=       | -    |___\\");


        //Carregamento pra da emoção ao jogo kkkk
        for (int i = 5; i > 0; i--) {
            try {
                Thread.sleep(1000); // Simula o carregamento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("====================================");
        System.out.println("|                                  |");
        System.out.println("|     Escolha seu Herói:           |");
        System.out.println("|                                  |");
        System.out.println("|  1. Gandolf - O Mago             |");
        System.out.println("|  2. Aragon - O Guerreiro         |");
        System.out.println("|  3. Sair do Jogo                 |");
        System.out.println("|                                  |");
        System.out.println("====================================");

        int escolha;
            do {
                try {
                    System.out.print("Escolha seu Herói: ");
                    escolha = scanner.nextInt();

                    switch (escolha) {
                        case 1:
                            //ESSE AQUI É PRA CHAMAR O QUE CADA UM TEM NA CLASSE AO SER ESCOLHIDO
                            jogador = new Mago();
                            System.out.println("Você escolheu o Mago Gandolf para lutar contra o terrível Dragão Volvagia!");
                            break;
                        case 2:
                            jogador = new Guerreiro();
                            System.out.println("Você escolheu o Guerreiro Aragon para lutar contra o terrível Dragão Volvagia!");
                            break;
                        case 3:
                            System.out.println("Você saiu do jogo. Até logo!");
                            return;
                        default:
                            System.out.println("Opção inválida. Por favor, escolha novamente.");
                    }
                } catch (InputMismatchException e){
                    System.out.println("Opção inválida. Por favor, digite um número válido.");
                    scanner.next(); //limpar o buffer
                    escolha = 0;
                }
            } while (escolha < 1 || escolha > 3);

        while (jogador.estaVivo() && inimigo.estaVivo()) {
            System.out.println("Escolha sua ação:");
            System.out.println("1. Atacar");
            System.out.println("2. Defender");
            

             //tratar exception ataque
             try {
                escolha = scanner.nextInt();
                } catch (InputMismatchException e) {
                System.out.println("Escolha inválida. Tente novamente.");
                scanner.next(); 
                continue; 
                }

            if (escolha == 1) {
                jogador.atacar(inimigo);
            } else if (escolha == 2) {
                jogador.defender(inimigo);
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
                continue;
            }

            if (inimigo.estaVivo()) {
                inimigo.atacar(jogador);
            }
        }

        if (jogador.estaVivo()) {
            System.out.println("------------------Você derrotou o temível dragão!---------------------");
            System.out.println("#######  #######  #######  #######  ######   #######  #     #  #######");
            System.out.println("#     #  #     #  #     #  #     #  #    #   #        ##    #  #");
            System.out.println("#######  #######  #######  #######  #######  ####     # ### #  #######");
            System.out.println("#        #     #  #    #   #     #  #     #  #        #    ##        #");
            System.out.println("#        #     #  #    ##  #     #  #######  #######  #     #  #######");
        } else {
            System.out.println("------------------Você foi derrotado pelo dragão!-------------------");
            System.out.println("  _____          __  __ ______    ______      ________ _____  ");
            System.out.println(" / ____|   /\\   |  \\/  |  ____|  / __ \\ \\    / /  ____|  __ \\ ");
            System.out.println("| |  __   /  \\  | \\  / | |__    | |  | \\ \\  / /| |__  | |__) |");
            System.out.println("| | |_ | / /\\ \\ | |\\/| |  __|   | |  | | \\ \\/ / |  __| |  _  / ");
            System.out.println("| |__| |/ ____ \\| |  | | |____  | |__| |  \\  /  | |____| | \\ \\ ");
            System.out.println(" \\_____/_/    \\_\\_|  |_|______|  \\____/    \\/   |______|_|  \\_\\");
        }
    }
}