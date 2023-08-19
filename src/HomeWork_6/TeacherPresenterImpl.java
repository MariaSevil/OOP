package HomeWork_6;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
//Single Responsibility Principle:класс отвечает за бизнес -логику управления объектами Teacher.
public class TeacherPresenterImpl implements TeacherPresenter {
    private List<Teacher>teachers = new ArrayList<>();
    private TeacherView view;
// Dependency Inversion Principle: конструктор зависит от абстракции (интерфейса),а не от конкретного класса.
    public TeacherPresenterImpl(TeacherView view){

        this.view =view;
    }
    //Open/Closed Principle: мы можем добавить новыхучителей без изменения существующего кода.
    public Teacher createTeacher(String firstName, String middleName,String lastName){
        Teacher teacher = new Teacher(firstName, middleName, lastName);
        teachers.add(teacher);
        return  teacher;
    }
    //Простой метод для отображения всех учителей.
    public void displayAllTeacher(){
        view.displayTeachers(teachers);
    }
    // Метод для сортировки учителей.
    public void sortTeachers(){
        Collections.sort(teachers,new ServiceComparator());
    }
}