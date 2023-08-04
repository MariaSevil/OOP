package HomeWork_4;
import java.util.List;
public interface TeacherView<T extends TeacherService> {
    void sendOnConsole(List<T>teachers);

}
