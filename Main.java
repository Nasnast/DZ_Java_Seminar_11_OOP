/*Домашнее задание — Создать класс TeacherView с функцией создание и возвращения всех учителей
 */
package DZ;

import DZ.data.Student;
import DZ.data.Teacher;
import DZ.view.StudentView;
import DZ.view.TeacherView;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Asya", 20, "IT");
        Student st2 = new Student("Masya", 22, "IT-java");
        Student st3 = new Student("Vasya", 19, "IT-all");

        StudentView studentView = new StudentView();
        studentView.createStudent(st1);
        studentView.createStudent(st2);
        studentView.createStudent(st3);

        studentView.readStudent();

        // teacher
        Teacher teacher1 = new Teacher("Волкова М.А.", 32, "Русский язык");
        Teacher teacher2 = new Teacher("Зайцев С.Ю.", 45, "Физика");
        Teacher teacher3 = new Teacher("Петрова М.А.", 40, "Английский язык");

        TeacherView teacherView = new TeacherView();
        teacherView.createTeacher(teacher1);
        teacherView.createTeacher(teacher2);
        teacherView.createTeacher(teacher3);

        teacherView.readTeacher();
    }

}
