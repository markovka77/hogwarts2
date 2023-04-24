public class Main {
    public static void main(String[] args) {
        Griffindor harry = new Griffindor("Garry Potter",10, 15, 43, 80, 70);
        Griffindor hermione = new Griffindor("Hermione Granger", 8, 10, 69, 75, 86);
        Griffindor ron = new Griffindor("Ron Weasley", 7, 12, 42, 78, 40);

        Hufflepuff zacharias = new Hufflepuff("Zacharias Smith", 15, 20, 83, 56, 34);
        Hufflepuff cedric = new Hufflepuff("Cedric Diggory", 14, 18, 67, 98, 74);
        Hufflepuff justin = new Hufflepuff("Justin Finch-Fletchley", 12, 13, 69, 33, 82);

        Slytherin draco = new Slytherin("Draco Malfoy", 11, 16, 76, 36, 97, 68, 88);
        Slytherin graham = new Slytherin("Graham Montague", 9, 14, 27, 45, 98, 56, 74);
        Slytherin georgy = new Slytherin("Gregory Goyle", 6, 9, 53, 64, 85, 67, 72);

        Ravenclaw cho = new Ravenclaw("Cho Chang", 17, 19, 46, 78, 34, 56);
        Ravenclaw padma = new Ravenclaw("Padma Patil", 13, 11, 78, 49, 50, 58);
        Ravenclaw marcus = new Ravenclaw("Marcus Belby", 12, 17, 79,37,96,60);

        System.out.println(harry);
        harry.bestStudent(ron);
        hermione.bestStudent(georgy);

    }


}



