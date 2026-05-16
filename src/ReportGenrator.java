package srms;

import java.util.*;

public class ReportGenerator {

    public static void printAllStudents(List<Student> students) {
        System.out.println("\n=== Students Report ===");

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s.getId() + " - " + s.getName() + " - " + s.getMajor() + " - GPA: " + s.getGpa());
        }
    }
}