import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Daniel", "HG",3);
        Student s2 = new Student(2, "John", "FFM",2);
        Student s3 = Student.builder()
                .id(3)
                .name("Marc")
                .address("FFM")
                .build();

        Student s4 = s3.withName("Bob");

        System.out.println(s3);
        System.out.println(s4);

        Teacher t1 = new Teacher(1 , "Peter", "Physik");

        List<Student> studentsList1 = new ArrayList<>();
        studentsList1.add(s1);
        studentsList1.add(s2);

        Course c1 = new Course(1, "Mathematics", t1, studentsList1);

        System.out.println(s1.getName());

        s1.setName("Alice Smith");
        System.out.println(s1.getName());

        System.out.println(t1);
        System.out.println(c1);

        System.out.println(UniversityService.calculateAverageGradeCourse(c1));

        University myUniversity = new University(1, "My University", c1);
        System.out.println(myUniversity);
    }
}
