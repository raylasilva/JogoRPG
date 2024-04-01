
import java.util.Scanner;
import java.util.InputMismatchException;

public class Guerreiro extends Jogador {
    public Guerreiro() {
        //Chamar o construtor direto da classe jogador, com atributos de vida, defesa e ataque ja setados
      new Jogador();
    }

    public void atacar(Inimigo dragao) {
        int escolha=0;
        do {
            try {
                System.out.println("Escolha seu ataque:");
                System.out.println("1. Golpe Devastador - Dano: 35");
                System.out.println("2. Matador de Dragão - Dano: 25");
                System.out.println("3. Investida Brutal - Dano: 30");
                System.out.println("4. Corte Furioso - Dano: 20");
        
                Scanner scanner = new Scanner(System.in);
                escolha = scanner.nextInt();
                ataqueEspecial(dragao, escolha);
                } catch (InputMismatchException e) {
                System.out.println("Opção de ataque inválida. Digite um número inteiro.");
                }
            } while (escolha < 1 || escolha > 4);
        }
    public void defender(Inimigo dragao) {
        int escolha=0;
        do {
            try {
                System.out.println("Escolha sua defesa:");
                System.out.println("1. Escudo: Um escudo grande e resistente para bloquear ataques físicos. - Dano: 2");
                System.out.println("2. Grevas: ativar proteção para as pernas, cobrindo os pés até abaixo dos joelhos - Dano: 5");
                System.out.println("3. Elmo: Um elmo robusto para proteger a cabeça contra ataques diretos, como bafo de fogo. - Dano: 10");
                System.out.println("4. Manobras defensivas, com técnicas de defesa como esquivas, bloqueios e contra-ataque - Dano: 15");
        
                Scanner scanner = new Scanner(System.in);
                escolha = scanner.nextInt();
                defenderEspecial(dragao, escolha);
                } catch (InputMismatchException e) {
                System.out.println("Opção de defesa inválida. Digite um número inteiro.");
                }
            } while (escolha < 1 || escolha > 4);
        }

    public void defenderEspecial(Inimigo dragao, int escolha) {
        switch (escolha) {
            case 1:
                System.out.println("Você se defende com seu poderoso escudo do dragão, que fica tonto com tamanha resistência!");
                dragao.vida -= 2;
                break;
            case 2:
                System.out.println("Você ativou grevas, ops o Dragão ficou confuso!");
                dragao.vida -= 5;
                break;
            case 3:
                System.out.println("O dragão até tentou, mas não foi pareo com seu elmo!");
                dragao.vida -= 10;
                break;
            case 4:
                System.out.println("Você ativou suas manobras defensivas, o dragão não se preparou para tamanha habilidade!");
                dragao.vida -= 15;
                break;
            default:
                System.out.println("Opção de defesa inválida.");
                break;
        }
        //Não mostrar vidas em negativos
        if (dragao.vida > 0) {
            System.out.println("Vida do dragão: " + dragao.vida);
        }
//        System.out.println("Você assume uma Postura Defensiva com seu escudo!");
//        this.defendendo = true;
    }


    public void ataqueEspecial(Inimigo dragao, int escolha) {
        switch (escolha) {
            case 1:
                System.out.println("Você desfere um Golpe Devastador no dragão!");
                dragao.vida -= 35;
                break;
            case 2:
                System.out.println("Você executa um ataque Matador de Dragão!");
                dragao.vida -= 25;
                break;
            case 3:
                System.out.println("Você avança com uma Investida Brutal no dragão!");
                dragao.vida -= 30;
                break;
            case 4:
                System.out.println("Você desfere um Corte Furioso no dragão!");
                dragao.vida -= 20;
                break;
            default:
                System.out.println("Opção de ataque inválida.");
                break;
        }
        //Não mostrar vidas em negativos
        if (dragao.vida > 0) {
            System.out.println("Vida do dragão: " + dragao.vida);
        }
    }
}




