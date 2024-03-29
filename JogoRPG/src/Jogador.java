class Jogador {
    protected int vida;
    protected int ataque;
    protected boolean defendendo;

    public Jogador() {
        this.vida = 100;
        this.ataque = 10;
        this.defendendo = false;
    }

    public void atacar(Inimigo dragao) {
        System.out.println("Você ataca o dragão!");
        int dano = this.ataque;
        if (defendendo) {
            dano /= 2;
            defendendo = false;
        }
        dragao.vida -= dano;
        System.out.println("Vida do dragão: " + dragao.vida);
    }

    public void defender() {
        System.out.println("Você assume uma postura defensiva!");
        defendendo = true;
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}
