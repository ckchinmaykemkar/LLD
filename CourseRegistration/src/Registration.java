import java.time.LocalDateTime;

public class Registration {
    private final Student student;
    private final Course course;
    private final LocalDateTime registrationTime;

    public Registration(Student student, Course course, LocalDateTime registrationTime) {
        this.student = student;
        this.course = course;
        this.registrationTime = registrationTime;
    }
}
