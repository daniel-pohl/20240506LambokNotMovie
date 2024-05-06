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
        Student s5 = new Student(5, "Jane", "FFM",1);

        System.out.println(s3);
        System.out.println(s4);

        Teacher t1 = new Teacher(1 , "Peter", "Physik");
        Teacher t2 = new Teacher(2 , "Klaus", "Mathe");
        List<Student> studentsList1 = new ArrayList<>();
        studentsList1.add(s1);
        studentsList1.add(s2);
        studentsList1.add(s5);

        Course c1 = new Course(1, "Mathematics", t1, studentsList1);

        System.out.println(c1);
        System.out.println("-----------");
        System.out.println(s1.getName());

        s1.setName("Alice Smith");
        System.out.println(s1.getName());

        System.out.println(t1);
        System.out.println(c1);

        UniversityService blabla = new UniversityService();
        System.out.println(blabla.calculateAverageGradeCourse(c1));


    }
}
