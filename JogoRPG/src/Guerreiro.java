import java.util.Random;

class Guerreiro extends Jogador {
    // Construtor da classe Guerreiro
    public Guerreiro(String nome, int vida, int mana) {
        super(nome, vida, mana);
    }

    // Implementação do método abstrato para atacar um inimigo
    @Override
    public void atacar(Inimigo inimigo, Random random) {
        System.out.println(getNome() + " atacou o dragão com sua espada sem piedade!");
        // Implementação do ataque do guerreiro
    }

    // Implementação do método para defender-se
    @Override
    public void defender() {
        // Implementação da defesa específica do guerreiro
        System.out.println(getNome() + " assumiu uma postura defensiva!");
    }

    // Implementação do método para recuperar mana
    @Override
    public void recuperarMana() {
        // Implementação específica do guerreiro para recuperar mana
        System.out.println(getNome() + " recuperou 20 de mana.");
        setMana(getMana() + 20);
    }
}