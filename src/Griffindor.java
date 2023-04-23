public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(String fullName, int magic, int transgretion, int nobility, int honor, int courage) {
        super(fullName, magic, transgretion);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return this.nobility;
    }

    public int getHonor() {
        return this.honor;
    }

    public int getCourage() {
        return this.courage;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void calculate(Griffindor[] griffindor){

    }

//    Griffindor harry = new Griffindor("Garry Potter",10, 15, 43, 80, 70);
//    Griffindor hermione = new Griffindor("Hermione Granger", 8, 10, 69, 75, 86);
//    Griffindor ron = new Griffindor("Ron Weasley", 7, 12, 42, 78, 40);


}
