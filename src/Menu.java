import java.util.Scanner;

public class Menu {

    public static void showMenu(RecordManager manager) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== SRMS MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display Students");
            System.out.println("5. Generate Report");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter name: ");
                    String name = input.nextLine();

                    System.out.print("Enter ID: ");
                    String id = input.nextLine();

                    System.out.print("Enter age: ");
                    int age = input.nextInt();

                    System.out.print("Enter GPA: ");
                    double gpa = input.nextDouble();

                    System.out.print("Enter year: ");
                    int year = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter department name: ");
                    String deptName = input.nextLine();

                    System.out.print("Enter department code: ");
                    String deptCode = input.nextLine();

                    Department dept =
                        new Department(deptName, deptCode);

                    Student s =
                        new Student(name, id, age, dept, gpa, year);

                    manager.addStudent(s);

                    break;

                case 2:

                    System.out.print("Enter student ID: ");
                    String removeId = input.nextLine();

                    manager.removeStudent(removeId);

                    break;

                case 3:

                    System.out.print("Enter student ID: ");
                    String searchId = input.nextLine();

                    Student found =
                        manager.searchStudent(searchId);

                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Student not found.");
                    }

                    break;

                case 4:

                    manager.listStudents();

                    break;

                case 5:

                    AutoSaveThread report =
                        new AutoSaveThread(manager.getStudents());

                    report.start();

                    break;

                case 6:

                    System.out.println("Exiting program...");
                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}
