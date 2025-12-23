import java.util.List;

public class Course {

    private String code;
    private String name;
    private int hours;

    private Department department;
    private List<Student> students;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void enrollStudent(Student student) {
    }
}
