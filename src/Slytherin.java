public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slytherin(String fullName, int magic, int transgretion, int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(fullName, magic, transgretion);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getCunning() {
        return this.cunning;
    }

    public int getDetermination() {
        return this.determination;
    }

    public int getAmbition() {
        return this.ambition;
    }

    public int getResourcefulness() {
        return this.resourcefulness;
    }

    public int getPower() {
        return this.power;
    }
}
