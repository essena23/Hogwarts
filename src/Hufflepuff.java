import java.util.Objects;

public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;


    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "Имя студента = " + name +
                "; Сила магии = " + magicPower +
                "; Сила трансгрессии = " + transgressionDistance +
                "; Трудолюбие = " + hardWork +
                "; Верность = " + loyalty +
                "; Честность =" + honesty +
                '}';
    }
    public int countAbiliiesTotal() {
        return hardWork + loyalty + honesty;
    }
    public void compareHufflepuffStudents(Hufflepuff student) {
        int sum1 = countAbiliiesTotal();
        int sum2 = student.countAbiliiesTotal();

        if (sum1 > sum2) {
            System.out.println(getName() + " сильнее " + student.getName());
        } else if (sum1 < sum2) {
            System.out.println(student.getName() + " сильнее " + getName());
        } else {
            System.out.println("Студенты равны");
        }

    }
}
