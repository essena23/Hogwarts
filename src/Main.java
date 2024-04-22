public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindors = {
                new Griffindor("Harry Potter", 51, 45, 74, 36, 65),
                new Griffindor("Hermione Granger", 38, 25, 85, 80, 69),
                new Griffindor("Ron Weasley", 15, 20, 40, 47, 62),

        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zacharias Smith", 31, 32, 74, 52,41),
                new Hufflepuff("Cedric Diggory", 64, 52, 65, 78,80),
                new Hufflepuff("Justin Finch-Fletchley", 28, 27, 66, 50,40),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Cho Chang", 50, 84, 70, 68, 71, 55),
                new Ravenclaw("Padma Patil", 40, 30, 35, 32, 5, 60),
                new Ravenclaw("Marcus Belby", 40, 30, 35, 32, 5, 60),

        };
        Slytherin[] slytherins = {
                new Slytherin("Draco Malfoy", 66, 68, 80, 55, 90, 75, 89),
                new Slytherin("Graham Montague", 49, 30, 45, 50, 51, 60, 46),
                new Slytherin("Gregory Goyle", 59, 70, 74, 49, 67, 64, 65),
        };
        PrintService printService = new PrintService();
        printService.print(griffindors);
        System.out.println();
        printService.print(slytherins);
        System.out.println();
        printService.print(hufflepuffs);
        System.out.println();
        printService.print(ravenclaws);



    }



}