package HomeWork_4;
import java.util.List;
public interface TeacherController<T extends TeacherService> {
    T create(String firstName,String middleName,String lastName);
    void sendOnConsole(List<T>teachers);
}
