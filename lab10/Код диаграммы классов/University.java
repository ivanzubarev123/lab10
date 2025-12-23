import java.util.List;

public class University {

    private String name;
    private String address;

    private Teacher rector;
    private List<Faculty> faculties;
    private List<Student> students;

    public String getName() {
        return name;
    }

    public void enrollStudent(Student student) {
    }
}
