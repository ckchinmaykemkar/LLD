import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class CourseRegistrationSystem {

    private static CourseRegistrationSystem instance;
    private final Map<String, Course> courses;
    private final Map<Integer, Student> students;
    private final List<Registration> registrations;

    private CourseRegistrationSystem() {
        courses = new ConcurrentHashMap<>();
        students = new ConcurrentHashMap<>();
        registrations = new CopyOnWriteArrayList<>();
    }

    public static synchronized CourseRegistrationSystem getInstance() {
        if (instance == null) {
            instance = new CourseRegistrationSystem();
        }
        return instance;
    }

    public void addCourse(Course course){
        courses.put(course.getCode(), course);
    }

    public void addStudent(Student student){
        students.put(student.getId(), student);
    }

    public List<Course> searchCourses(String query) {
        List<Course> result = new ArrayList<>();

        result = courses.values().stream().filter(it->
                it.getName().contains(query) || it.getCode().contains(query)).collect(Collectors.toList());

        return result;
    }


    public synchronized boolean registerCourse(Student student, Course course) {
        if(course.getEnrolledStudents() < course.getMaxCapacity()){
            Registration registration = new Registration(student,course, LocalDateTime.now());
            course.setEnrolledStudents(course.getEnrolledStudents()+1);
            registrations.add(registration);
            student.getRegisteredCourses().add(course);
            notifyObservers(course);
            return true;

        }
      return false;
    }

    private void notifyObservers(Course course) {
        // Notify observers (e.g., UI) about the updated course enrollment
        // ...
    }

    }
