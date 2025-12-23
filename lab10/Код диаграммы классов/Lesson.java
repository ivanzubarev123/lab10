import java.time.LocalDate;

public class Lesson {

    private String topic;
    private LocalDate date;

    private Course course;
    private Teacher teacher;
    private Auditorium auditorium;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
