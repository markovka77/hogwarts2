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

    @Override
    public String toString() {
        return "Hufflepuff{" +
                super.toString() +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public void bestStudent(Hufflepuff student) {
        int skillSum = this.industriousness + this.loyalty + this.honesty;
        int skillSumStudent = student.industriousness + student.loyalty + student.honesty;
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
