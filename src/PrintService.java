public class PrintService {
    public void print(Griffindor[]griffindors) {
        System.out.println("Студенты Гриффиндора:");
        for (int i = 0; i < griffindors.length; i++) {
            Griffindor griffindor = griffindors[i];
            System.out.println(griffindors[i]);

        }

    }

    public void print(Slytherin[] slytherins) {
        System.out.println("Студенты Слизерина:");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println(slytherins[i]);

        }
    }

    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Студенты Пуффендуя:");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println(hufflepuffs[i]);

        }
    }

    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Студенты Когтеврана");
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println(ravenclaws[i]);

        }
    }
}
