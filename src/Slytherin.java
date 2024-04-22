import java.util.Objects;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;


    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "Имя студента = " + name +
                "; Сила магии = " + magicPower +
                "; Расстояние трансгрессии = " + transgressionDistance +
                "; хитрость = " + cunning +
                "; решительность = " + determination +
                "; амбициозность = " + ambition +
                "; находчивость = " + resourcefulness +
                "; жажда власти = " + lustForPower +
                '}';
    }
    public int countAbiliiesTotal() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }
    public void compareSlytherinStudents(Slytherin student) {
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
