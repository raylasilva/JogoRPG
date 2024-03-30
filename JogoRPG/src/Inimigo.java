import java.util.Random;

public class Inimigo {
    protected int vida;
    protected int ataque;

    protected int defesa;

    public Inimigo() {
        this.vida = 200;
        this.ataque = 15;
        this.defesa = 5;
    }

    public void atacar(Jogador jogador) {

        //Jogador perde vida atacando o dragão
        System.out.println("O dragão ataca você!");
        int dano = this.ataque;
        // Jogador perde vida se defendendo
        if (jogador.defesa > 0) {
            // COLOQUEI DO DANO AQUI, QUE ESTAVA EM JOGADOR
            dano = this.defesa;

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
