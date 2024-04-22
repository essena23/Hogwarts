import java.util.Objects;

public abstract class Hogwarts {
    protected String name;
    protected int magicPower;
    protected int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }


    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public int countBaseAbilitiesTotal() {
        return magicPower + transgressionDistance;
    }
    public void baseCompareStudents(Hogwarts hogwarts) {
        int sum1 = countBaseAbilitiesTotal();
        int sum2 = hogwarts.countBaseAbilitiesTotal();

        if (sum1 > sum2) {
            System.out.println(getName() + " сильнее " + hogwarts.getName());
        } else if (sum1 < sum2) {
            System.out.println(hogwarts.getName() + " сильнее " + getName());
        } else {
            System.out.println("Студенты равны");
        }
    }

}
