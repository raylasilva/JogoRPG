import java.util.Random;
import java.util.Scanner;

class Mago extends Jogador {
        public Mago() {
            this.vida = 100;
            this.ataque = 20;
        }

    public void atacar(Inimigo dragao) {
        System.out.println("Escolha seu ataque:");
        System.out.println("1. Raio Gélido - Dano: 10");
        System.out.println("2. Bola de Fogo - Dano: 20");
        System.out.println("3. Trovão - Dano: 20");
        System.out.println("4. Tempestade de Gelo - Dano: 20");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        ataqueEspecial(dragao, escolha);
    }


    public void defender() {
        System.out.println("Você invoca um Escudo Mágico para se defender!");
        this.defendendo = true;
    }
    public void ataqueEspecial(Inimigo dragao, int escolha) {
        switch (escolha) {
            case 1:
                System.out.println("Você lança um Raio Gélido no dragão!");
                dragao.vida -= 10;
                break;
            case 2:
                System.out.println("Você lança uma Bola de Fogo no dragão!");
                dragao.vida -= 20;
                break;
            case 3:
                System.out.println("Você lança um Trovão no dragão!");
                dragao.vida -= 20;
                break;
            case 4:
                System.out.println("Você conjura uma Tempestade de Gelo sobre o dragão!");
                dragao.vida -= 20;
                break;
            default:
                System.out.println("Opção de ataque inválida.");
                break;
        }
        System.out.println("Vida do dragão: " + dragao.vida);
    }


}

