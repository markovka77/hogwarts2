public class Main {
    public static void main(String[] args) {
        Hogwarts[] students = new Hogwarts[]{
                new Hogwarts("Garry Potter", 10, 15),
                new Hogwarts("Hermione Granger", 8, 10),
                new Hogwarts("Ron Weasley", 7, 12),
                new Hogwarts("Draco Malfoy", 11, 16),
                new Hogwarts("Graham Montague", 9, 14),
                new Hogwarts("Gregory Goyle", 6, 9),
                new Hogwarts("Zacharias Smith", 15, 20),
                new Hogwarts("Cedric Diggory", 14, 18),
                new Hogwarts("Justin Finch-Fletchley", 12, 13),
                new Hogwarts("Cho Chang", 17, 19),
                new Hogwarts("Padma Patil", 13, 11),
                new Hogwarts("Marcus Belby", 12, 17)};
        Griffindor[] grifStud = new Griffindor[]{
                new Griffindor("Garry Potter", 10, 15, 43, 80, 70),
                new Griffindor("Hermione Granger", 8, 10, 69, 75, 86),
                new Griffindor("Ron Weasley", 7, 12, 42, 78, 40)};
        Slytherin[] slyStud = new Slytherin[]{
                new Slytherin("Draco Malfoy", 11, 16, 76, 36, 97, 68, 88),
                new Slytherin("Graham Montague", 9, 14, 27, 45, 98, 56, 74),
                new Slytherin("Gregory Goyle", 6, 9, 53, 64, 85, 67, 72)};
        Hufflepuff[] hufStud = new Hufflepuff[]{
                new Hufflepuff("Zacharias Smith", 15, 20, 83, 56, 34),
                new Hufflepuff("Cedric Diggory", 14, 18, 67, 98, 74),
                new Hufflepuff("Justin Finch-Fletchley", 12, 13, 69, 33, 82)};
        Ravenclaw[] ravStud = new Ravenclaw[]{
                new Ravenclaw("Cho Chang", 17, 19, 46, 78, 34, 56),
                new Ravenclaw("Padma Patil", 13, 11, 78, 49, 50, 58),
                new Ravenclaw("Marcus Belby", 12, 17, 79, 37, 96, 60)};
        System.out.println("Всего студентов : " + students.length);
        System.out.println();
        PrintService.print(grifStud);
        System.out.println();
        PrintService.print(hufStud);
        System.out.println();
        PrintService.print(ravStud);
        System.out.println();
        PrintService.print(slyStud);
        System.out.println();
    }
}



