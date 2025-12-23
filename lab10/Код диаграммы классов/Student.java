import java.time.LocalDate;
import java.util.List;

public class Student {

    private int id;
    private String fullName;
    private LocalDate birthDate;
    private String recordBookNumber;

    private List<Course> courses;
    private List<Grade> grades;

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void registerForCourse(Course course) {
    }
}
