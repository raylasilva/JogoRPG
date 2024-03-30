public class Jogador {
    protected int vida;
    protected int ataque;
    protected int defesa;

    public Jogador() {
        this.vida = 100;
        this.ataque = 10;
        this.defesa = 10;
    }



    // ESSE AQUI REALMENTE AINDA NÃO ENTENDI A LÓGICA T.T o sono bateu
    public void atacar(Inimigo dragao) {
        System.out.println("Ataque indefinido.");
    }


    public void ataqueEspecial(Inimigo dragao, int escolha) {
        System.out.println("Ataque indefinido.");
    }

    public void defender(Inimigo dragao) {
        System.out.println("Defesa indefinida.");
    }

//alterado ate aqui, calma

    public void defenderEspecial(Inimigo dragao, int escolha) {
        System.out.println("Defesa indefinida.");
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}

