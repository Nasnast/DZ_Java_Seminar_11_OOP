package DZ.data;

public class Teacher extends User {
    private String discipline;

    public Teacher() {
    }

    public Teacher(String name, int age, String discipline) {
        super(name, age);
        this.discipline = discipline;
    }

    public String getDiscipline() {
        return discipline;
    }

    @Override
    public String toString() {
        return "\n" + "Teacher{" +
                "discipline='" + discipline + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
