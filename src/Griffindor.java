import java.util.Objects;

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }


    @Override
    public String toString() {
        return "Griffindor{" +
                "Имя студента = " + name +
                "; Сила магии = " + magicPower +
                "; Расстояние трансгрессии = " + transgressionDistance +
                "; Благородство = " + nobility +
                "; Честность = " + honor +
                "; Храбрость = " + bravery +
                '}';
    }

    public int countAbiliiesTotal() {
        return nobility + honor + bravery;
    }
    public void compareGriffindorStudents(Griffindor student) {
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
