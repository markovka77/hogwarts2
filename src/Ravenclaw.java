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

    @Override
    public String toString() {
        return "Ravenclaw{" +
                super.toString() +
                "smart=" + smart +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                '}';
    }

    public void bestStudent(Ravenclaw student) {
        int skillSum = this.smart + this.wisdom + this.wit + this.creation;
        int skillSumStudent = student.smart + student.wisdom + student.wit + student.creation;
        if (skillSum > skillSumStudent) {
            System.out.println(this.getFullName() + " лучше чем " + student.getFullName());
        }
        if (skillSum < skillSumStudent) {
            System.out.println(student.getFullName() + " лучше чем " + this.getFullName());
        }
        if (skillSum == skillSumStudent) {
            System.out.println("Студенты одинаково хороши.");
        }
    }

}

