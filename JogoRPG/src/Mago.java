public class Mago extends Jogador {
    private int mana;

    public Mago(int vida, int ataque, int mana) {
        super(vida, ataque);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
