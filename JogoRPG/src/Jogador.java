public class Jogador {
    protected int vida;
    protected int ataque;
    protected int defesa;

    public Jogador() {
        this.vida = 150;
        this.ataque = 0;// Só inicializa o ataque, O valor de ataque ele escolhe
        this.defesa = 0;// Só inicializa a defesa, O valor de defesa ele escolhe
    }

    public void atacar(Inimigo dragao) {
        System.out.println("Ataque indefinido.");
    }


    public void ataqueEspecial(Inimigo dragao, int escolha) {
        System.out.println("Ataque indefinido.");
    }

    public void defender(Inimigo dragao) {
        System.out.println("Defesa indefinida.");
    }


    public void defenderEspecial(Inimigo dragao, int escolha) {
        System.out.println("Defesa indefinida.");
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}

