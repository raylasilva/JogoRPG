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
        jogador.vida -= this.ataque;
        System.out.println("Sua vida: " + jogador.vida);
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}