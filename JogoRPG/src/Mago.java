import java.util.Random;

class Mago extends Jogador {
    // Construtor da classe Mago
    public Mago(String nome, int vida, int mana) {
        super(nome, vida, mana);
    }

    // Implementação do método abstrato para atacar um inimigo
    @Override
    public void atacar(Inimigo inimigo, Random random) {
        System.out.println(getNome() + " lançou o feitiço Bólido Escuro contra o dragão!");
        // Implementação do ataque do mago
    }

    // Implementação do método para defender-se
    @Override
    public void defender() {
        // Implementação da defesa específica do mago
        System.out.println(getNome() + " conjurou um escudo mágico!");
    }

    @Override
    public void recuperarMana() {
        // Implementação específica do mago para recuperar mana
        System.out.println(getNome() + " recuperou 20 de mana.");
        setMana(getMana() + 20);
    }
}
