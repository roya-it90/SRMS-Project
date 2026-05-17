public class Main {
    public static void main (String [] args){
        RecordManager manager = new RecordManager();

       
        Department IT = new Department("Information technology", "IT");

      
        Student s1 = new Student("sara", "123", 21, IT, 4.8, 3);

        manager.addStudent(s1);

        System.out.println("=== All Students ===");
        manager.listStudents();

        System.out.println("\n=== Search Result ===");
        Student found = manager.searchStudent("123");
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Student not found.");
        }
        RecordManager rm = new RecordManager();
        List<Student> students = rm.getAllStudents(); 

        FileManager.saveToFile(students);

        ReportGenerator.printAllStudents(students);
    }
}
    }

}
