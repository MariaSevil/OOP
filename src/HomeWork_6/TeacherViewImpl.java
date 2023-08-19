package HomeWork_6;

import java.util.List;
// Single Responsibility Principle: класс отвечает только за отображение списка учителей.
public class TeacherViewImpl implements TeacherView{

    public void displayTeachers(List<Teacher>teachers){
        for (Teacher teacher: teachers){
            System.out.println(teacher.getFullName());
        }
    }
}