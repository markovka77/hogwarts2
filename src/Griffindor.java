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

    public static void BestStudentGriffindor(Griffindor[] grifStud, String st, String st1) {
        Griffindor[] var5 = grifStud;
        int var6 = grifStud.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            Griffindor i = var5[var7];
            Griffindor[] var9 = grifStud;
            int var10 = grifStud.length;

            for(int var11 = 0; var11 < var10; ++var11) {
                Griffindor j = var9[var11];
                int sum = i.getCourage() + i.getNobility() + i.getMagic() + i.getHonor() + i.getTransgretion();
                int sum1 = j.getCourage() + j.getHonor() + j.getNobility() + j.getMagic() + j.getTransgretion();
                if (sum1 > sum) {
                    System.out.println(i.getFullName());
                } else {
                    System.out.println(i.getFullName());
                }
            }
        }

    }
}
