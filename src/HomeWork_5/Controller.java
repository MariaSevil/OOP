package HomeWork_5;
import java.util.List;
public class Controller {
    private StudyGroupService studyGroupService;

    public Controller() {
        this.studyGroupService = new StudyGroupService();
    }

    public StudyGroup formStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.formStudyGroup(teacher, students);
    }
}
