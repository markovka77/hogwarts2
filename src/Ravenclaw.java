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

//    Ravenclaw cho = new Ravenclaw("Cho Chang", 17, 19, 46, 78, 34, 56);
//    Ravenclaw padma = new Ravenclaw("Padma Patil", 13, 11, 78, 49, 50, 58);
//    Ravenclaw marcus = new Ravenclaw("Marcus Belby", 12, 17, 79, 37, 96, 60);
}

