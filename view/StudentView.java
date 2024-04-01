package DZ.view;

import DZ.controller.Controller;
import DZ.data.Student;

public class StudentView {

    private Controller controller = new Controller();

    public void createStudent(Student student) {
        controller.createUser(student, student.getDirection());
        System.out.println("Студент создан успешно!");
    }

    public void readStudent() {
        // controller.read("student");
        System.out.println("Список всех студентов");
        controller.read("student");
    }
}
