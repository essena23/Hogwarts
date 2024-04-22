import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creative;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int mind, int wisdom, int wit, int creative) {
        super(name, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "Имя студента = " + name +
                "; Сила магии = " + magicPower +
                "; Сила трансгрессии = " + transgressionDistance +
                "; Ум = " + mind +
                "; Мудрость = " + wisdom +
                "; Остоумие = " + wit +
                "; Творчество = " + creative +
                '}';
    }
    public int countAbiliiesTotal() {
        return mind + wisdom + wit + creative;
    }
    public void compareRavenclawStudents(Ravenclaw student) {
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
