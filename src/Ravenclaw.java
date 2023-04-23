public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String fullName, int magic, int transgretion, int smart, int wisdom, int wit, int creation) {
        super(fullName, magic, transgretion);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getSmart() {
        return this.smart;
    }

    public int getWisdom() {
        return this.wisdom;
    }

    public int getWit() {
        return this.wit;
    }

    public int getCreation() {
        return this.creation;
    }
}
