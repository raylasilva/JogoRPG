import java.util.Random;

class Inimigo {
    protected int vida;
    protected int ataque;

    public Inimigo() {
        this.vida = 200;
        this.ataque = 15;
    }

    public void atacar(Jogador jogador) {
        System.out.println("O dragão ataca você!");
        int dano = this.ataque;
        if (jogador.defendendo) {
            // COLOQUEI DO DANO AQUI, QUE ESTAVA EM JOGADOR
            dano /= 2;
            jogador.defendendo = false;
        }
        jogador.vida -= dano;
        System.out.println("Sua vida: " + jogador.vida);
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}