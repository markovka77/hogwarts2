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

    @Override
    public String toString() {
        return "Slytherin{" +
                super.toString() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", power=" + power +
                '}';
    }

    public void bestStudent(Slytherin student) {
        int skillSum = this.cunning + this.determination + this.ambition + this.resourcefulness + this.power;
        int skillSumStudent = student.cunning + student.determination + student.ambition + student.resourcefulness + student.power;
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
