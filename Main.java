    public class Main {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("     SRMS - Student Record Management System");
        System.out.println("                Team Project - Part 1");
        System.out.println("==============================================\n");

        
        Department cs = new Department("Computer Science", "CS");
        Department it = new Department("Information Technology", "IT");

        
        Student s1 = new Student("Roya", "2023001",21,it, 4.75,3);
        Student s2 = new Student("remaz", "2023002",21,cs, 4.50,3 );
        Student s3 = new Student("rawan", "2023003",20,it, 4.20 ,3);

        
        RecordManager manager = new RecordManager();

        System.out.println(">>> Adding Students...");
        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);

        System.out.println("\n>>> Listing All Students:");
        manager.listStudents();

        System.out.println("\n>>> Searching for Student with ID 2023002:");
        Student found = manager.searchStudent("2023002");
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("\n>>> Deleting Student with ID 2023003...");
        manager.deleteStudent("2023003");

        System.out.println("\n>>> Listing Students After Deletion:");
        manager.listStudents();

        System.out.println("\n==============================================");
        System.out.println("     End of Part 1 - Backend Functionality");
        System.out.println("     Next: GUI, Database, and Full System");
        System.out.println("==============================================");
    }
}
