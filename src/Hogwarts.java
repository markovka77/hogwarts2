public class Hogwarts {
    final String fullName;
    private int magic;
    private int transgretion;

    public Hogwarts(String fullName, int magic, int transgretion) {
        this.fullName = fullName;
        this.magic = magic;
        this.transgretion = transgretion;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getMagic() {
        return this.magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgretion() {
        return this.transgretion;
    }

    public void setTransgretion(int transgretion) {
        this.transgretion = transgretion;
    }
}

