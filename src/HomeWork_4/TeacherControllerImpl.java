package HomeWork_4;

import java.util.List;

public class TeacherControllerImpl implements TeacherController<TeacherService>{
    public TeacherService create(String firstName, String middleName,String lastName){
        return new TeacherService(firstName,middleName,lastName);
    }
    public void sendOnConsole(List<TeacherService>techers){
        for (TeacherService teacher : techers){
            System.out.println(teacher.getFullName());
        }
    }
}
