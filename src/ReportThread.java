import java.util.ArrayList;

public class ReportThread extends Thread {

    private ArrayList<Student> students;

    public ReportThread(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public void run() {

        System.out.println("Generating report...");

        ReportGenerator.printAllStudents(students);

        System.out.println("Report generation completed.");
    }
}
