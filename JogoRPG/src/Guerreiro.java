
import java.util.Scanner;

class Guerreiro extends Jogador {
    public Guerreiro() {
        this.vida = 150;
        this.ataque = 15;
    }

    public void atacar(Inimigo dragao) {
        System.out.println("Escolha seu ataque:");
        System.out.println("1. Golpe Devastador - Dano: 35");
        System.out.println("2. Matador de Dragão - Dano: 25");
        System.out.println("3. Investida Brutal - Dano: 30");
        System.out.println("4. Corte Furioso - Dano: 20 ");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        ataqueEspecial(dragao, escolha);
    }

    public void defender() {
        System.out.println("Você assume uma Postura Defensiva com seu escudo!");
        this.defendendo = true;
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
        System.out.println("Vida do dragão: " + dragao.vida);
    }
}




