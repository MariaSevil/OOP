package HomeWork_4;

import java.util.List;

public class TeacherViewImpl implements TeacherView<TeacherService>{
    public void sendOnConsole(List<TeacherService>teachers){
        for (TeacherService teacher: teachers){
            System.out.println(teacher.getFullName());
        }
    }
}
