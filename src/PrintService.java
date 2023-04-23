

public class PrintService {

    public static void print(Griffindor[] grifStud) {
        System.out.println("Грифинодор : ");
        for (Griffindor griffindor : grifStud) {
            System.out.println("Имя: " + griffindor.getFullName()
                    + " Трансгрессия: " + griffindor.getTransgretion()
                    + " Магия: " + griffindor.getMagic()
                    + " Благородство: " + griffindor.getNobility()
                    + " Честь: " + griffindor.getHonor()
                    + " Храбрость: " + griffindor.getCourage());
        }


    }

    public static void print(Hufflepuff[] hufStud) {
        System.out.println("Паффендуй :");
        for (Hufflepuff hufflepuff : hufStud) {
            System.out.println("Имя: " + hufflepuff.getFullName()
                    + " Трансгрессия: " + hufflepuff.getTransgretion()
                    + " Магия: " + hufflepuff.getMagic()
                    + " Трудолюбте: " + hufflepuff.getIndustriousness()
                    + " Верность: " + hufflepuff.getLoyalty() +
                    " Честность: " + hufflepuff.getHonesty());


        }
    }


    public static void print(Ravenclaw[] ravStud) {
        System.out.println("Когтевран :");
        for (Ravenclaw ravenclaw : ravStud) {
            System.out.println("Имя: " + ravenclaw.getFullName()
                    + " Трансгрессия: " + ravenclaw.getTransgretion()
                    + " Магия: " + ravenclaw.getMagic()
                    + " Ум: " + ravenclaw.getSmart()
                    + " Мудрость: " + ravenclaw.getWisdom()
                    + " Остроумие: " + ravenclaw.getWit()
                    + " Творчество: " + ravenclaw.getCreation());

        }
    }


    public static void print(Slytherin[] slyStud) {
        System.out.println("Слизерин :");
        for (Slytherin slytherin : slyStud) {
            System.out.println("Имя: " + slytherin.getFullName()
                    + " Трансгрессия: " + slytherin.getTransgretion()
                    + " Магия: " + slytherin.getMagic()
                    + " Хитрость: " + slytherin.getCunning()
                    + " Решительность: " + slytherin.getDetermination()
                    + " Амбициозность: " + slytherin.getAmbition()
                    + " Власть: " + slytherin.getPower());

        }
    }




}
