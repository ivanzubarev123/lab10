import java.time.LocalDate;

public class Grade {

    private int value;
    private LocalDate date;

    private Student student;
    private Course course;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
