import java.util.Random;

public class Inimigo {
    protected int vida;
    protected int ataque;

    protected int defesa;
    Random random = new Random();

    public Inimigo() {
        this.vida = 200;
        this.ataque = 0; //Só inicializa o ataque, O valor de de dano pra ataque do heroi é aleatorio com o random
        this.defesa = 0; // Só inicializa a defesa, O valor de dano pra defesa do heroi é aleatorio com o random

    } //Defesa e ataque são aleatorios

    public void atacar(Jogador jogador) {

        //Jogador perde vida atacando o dragão, aleatoria com o random
        System.out.println("O dragão ataca você!");
        int dano = random.nextInt(15); // 0-15;
        // Jogador perde vida se defendendo, aleatoria com o random
        if (jogador.defesa > 0) {
            // COLOQUEI DO DANO AQUI, QUE ESTAVA EM JOGADOR
            dano = random.nextInt(15); // 0-15;

        }
        jogador.vida -= dano;

        //Para não mostrar vidas em negativos
        if (jogador.vida > 0) {
            System.out.println("Sua vida: " + jogador.vida);
        }
    }


        public boolean estaVivo () {
            return vida > 0;
        }
    }
