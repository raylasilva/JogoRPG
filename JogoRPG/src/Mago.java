import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Mago extends Jogador {
    public Mago() {
        //Chamar o construtor direto da classe jogador, com atributos de vida, defesa e ataque ja setados
        new Jogador();
    }

    public void atacar(Inimigo dragao) {
        int escolha =0;
        do {
            try {
                System.out.println("Escolha seu ataque:");
                System.out.println("1. Raio Gélido - Dano: 10");
                System.out.println("2. Bola de Fogo - Dano: 20");
                System.out.println("3. Trovão - Dano: 20");
                System.out.println("4. Tempestade de Gelo - Dano: 20");
        
                Scanner scanner = new Scanner(System.in);
                escolha = scanner.nextInt();
                ataqueEspecial(dragao, escolha);
            } catch (InputMismatchException e) {
                System.out.println("Opção de ataque inválida. Digite um número inteiro.");
            }
        } while (escolha < 1 || escolha > 4);
    }

    public void defender(Inimigo dragao) {
        int escolha =0;
        do {
            try {
                System.out.println("Escolha sua defesa:");
                System.out.println("1. Proteção Elemental: Você invoca uma aura protetora que absorve ou neutraliza danos - Dano: 8");
                System.out.println("2. Manipulação Temporal: Controle o tempo para desacelerar ou interromper temporariamente o ataque inimigo - Dano: 10");
                System.out.println("3. Ilusões Defensivas: Criar ilusões complexas para confundir ou desorientar o dragão. - Dano: 15");
                System.out.println("4. Teleportação: Se teleportar instantaneamente para escapar de situações perigosas ou de ataques iminentes - Dano: 7");
        
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
                System.out.println("Você se defende do fogo do dragão com sua aura!");
                dragao.vida -= 8;
                break;
            case 2:
                System.out.println("Você ativa manipulação temporal, parando o tempo por 2 minutos!");
                dragao.vida -= 10;
                break;
            case 3:
                System.out.println("Você conseguiu despistar o dragão!");
                dragao.vida -= 15;
                break;
            case 4:
                System.out.println("O dragão ate tentou mas não conseguiu te achar!");
                dragao.vida -= 7;
                break;
            default:
                System.out.println("Opção de defesa inválida.");
                break;
        }
        //Não mostrar vidas em negativos
        if (dragao.vida > 0) {
            System.out.println("Vida do dragão: " + dragao.vida);
        }
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
        //Não mostrar vidas em negativos
        if (dragao.vida > 0) {
            System.out.println("Vida do dragão: " + dragao.vida);
        }
    }

}

