public abstract class Hogwarts {
    private final String fullName;
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

    @Override
    public String toString() {
        return "Hogwarts{" +
                "fullName='" + fullName + '\'' +
                ", magic=" + magic +
                ", transgretion=" + transgretion +
                '}';
    }

    public void bestStudent(Hogwarts student) {
        int skillSum = this.magic + this.transgretion;
        int skillSumStudent = student.magic + student.transgretion;
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

