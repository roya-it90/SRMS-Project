import java.io.*;
import java.util.*;

public class FileManager {

    public static void saveToFile(List<Student> students) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"));

            for (Student s : students) {
                writer.write(s.getName() + "," + s.getId() + "," + s.getAge() + "," + s.getDepartment() + "," + s.getGpa() + "," + s.getYear());
                writer.newLine();
            }

            writer.close();
            System.out.println("✅ Data saved!");

        } catch (IOException e) {
            System.out.println("❌ Error saving file!");
        }
    }

    public static List<Student> loadFromFile() {
        List<Student> students = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 6) {
                    String name = data[0].trim();
                    String id = data[1].trim();
                    int age = Integer.parseInt(data[2].trim());
                    
                    Department dept = new Department(data[3].trim()); 
                    
                    double gpa = Double.parseDouble(data[4].trim());
                    int year = Integer.parseInt(data[5].trim());

                    students.add(new Student(name, id, age, dept, gpa, year));
                }
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("⚠️ No file found, starting fresh.");
        } catch (NumberFormatException e) {
            System.out.println("❌ Error parsing student data!");
        }

        return students;
    }
}