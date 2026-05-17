import java.util.List;

public class ReportGenerator {

    public static void printAllStudents(List<Student> students) {
        System.out.println("\n=== Students Report ===");

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s.getId() + " - " + s.getName() + " - " + s.getDepartment() + " - GPA: " + s.getGpa() + " - Year: " + s.getYear());
        }
    }
}
