package DZ.view;

import DZ.controller.Controller;
import DZ.data.Teacher;
import DZ.data.User;

public class TeacherView {
    private Controller controller = new Controller();

    public void createTeacher(Teacher teacher) {
        controller.createUser(teacher, teacher.getDiscipline());
        System.out.println("Создана запись: " + teacher.getName());

    }

    public void readTeacher() {
        System.out.println("Список учителей:");
        controller.read("teacher");
    }

}
