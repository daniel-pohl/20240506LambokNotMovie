import java.util.List;


public class UniversityService {

    public static double calculateAverageGradeCourse(Course course) {
        double totalGrade = 0;

        List<Student> students = course.getStudents();

        for (Student student : students) {
            totalGrade += student.getGrade();
        }
        return totalGrade / students.size();
    }

    public int calculateAverageGradeUni(University university) {


        return 0;
    }
}


