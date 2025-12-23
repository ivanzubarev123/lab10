import java.util.List;

public class Schedule {

    private String dayOfWeek;

    private Course course;
    private Auditorium auditorium;
    private List<Lesson> lessons;

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void generateSchedule() {
    }
}
