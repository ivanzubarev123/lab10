import java.util.List;

public class Teacher {

    private int id;
    private String fullName;
    private String position;
    private String academicDegree;

    private Department department;
    private List<Course> courses;

    public String getFullName() {
        return fullName;
    }

    public void assignGrade(Student student, Course course, int value) {
    }
}
