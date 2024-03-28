import java.util.Random;

abstract class Jogador {
    private String nome; // Nome do jogador
    private int vida; // Pontos de vida do jogador
    private int mana; // Mana (ou energia) do jogador

    // Construtor da classe Jogador
    public Jogador(String nome, int vida, int mana) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
    }

    // Método abstrato para atacar um inimigo
    public abstract void atacar(Inimigo inimigo, Random random);

    // Método abstrato para defender-se
    public abstract void defender();

    // Método para recuperar mana
    public void recuperarMana() {
        // Implementação genérica para recuperar mana
        System.out.println(nome + " recuperou 20 de mana.");
        mana += 20;
    }

    // Método para verificar se o jogador está vivo
    public boolean estaVivo() {
        return vida > 0;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}