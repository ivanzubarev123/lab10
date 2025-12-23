import java.util.List;

public class Faculty {

    private String name;

    private Teacher dean;
    private List<Department> departments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
