import java.util.Random;

class Inimigo {
    private static String nome; // Nome do inimigo
    private static int vida; // Pontos de vida do inimigo

    // Construtor da classe Inimigo
    public Inimigo(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    // Método para atacar um jogador
    public static void atacar(Jogador jogador, Random random) {
        // Implementação do ataque do inimigo
    }

    // Método para verificar se o inimigo está vivo
    public static boolean estaVivo() {
        return vida > 0;
    }

    // Getters e setters
    public static String getNome() {
        return nome;
    }

    public static int getVida() {
        return vida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}