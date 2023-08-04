package HomeWork_4;
import java.util.Arrays;
import java.util.List;
public class main {
    public static void main(String[] args){

    TeacherControllerImpl teacherController = new TeacherControllerImpl();

    TeacherViewImpl teacherView = new TeacherViewImpl();

        TeacherService teacher1 = new TeacherService("Семен", "Семенович ", "Семенов ");
        TeacherService teacher2 = new TeacherService(" Петр", " Петрович", "Петров ");
        TeacherService teacher3 = new TeacherService("Александр", "Александрович ", "Александров ");

        List<TeacherService>teachers = Arrays.asList(teacher1,teacher2,teacher3);
        ServiceComparator<TeacherService>comparator= new ServiceComparator<>();
        teachers.sort(comparator);
         teacherView.sendOnConsole(teachers);
        }
}

