import java.sql.SQLOutput;

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

    public void calculate(Griffindor[] griffindor) {

    }

    @Override
    public String toString() {
        return "Griffindor{" +
                super.toString() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';
    }

    public void bestStudent(Griffindor student) {
        int skillSum = this.nobility + this.honor + this.courage;
        int skillSumStudent = student.courage + student.honor + student.nobility;
        if (skillSum > skillSumStudent) {
            System.out.println(this.getFullName() + " лучше чем " + student.getFullName());
        }
        if (skillSum < skillSumStudent) {
            System.out.println(student.getFullName() + " лучше чем " + this.getFullName());
        }
        if (skillSum == skillSumStudent)
            System.out.println("Студенты одинаково хороши.");
    }
}



