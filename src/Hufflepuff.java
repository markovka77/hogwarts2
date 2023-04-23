public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String fullName, int magic, int transgretion, int industriousness, int loyalty, int honesty) {
        super(fullName, magic, transgretion);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return this.industriousness;
    }

    public int getLoyalty() {
        return this.loyalty;
    }

    public int getHonesty() {
        return this.honesty;
    }
}
