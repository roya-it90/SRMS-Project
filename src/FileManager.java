package srms;

import java.io.*;
import java.util.*;

public class FileManager {

    
    public static void saveToFile(List<Student> students) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"));

            for (Student s : students) {
                writer.write(s.getId() + "," + s.getName() + "," + s.getGpa() + "," + s.getMajor());
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
                
                
                if (data.length == 4) {
                    
                    int id = Integer.parseInt(data[0].trim());
                    String name = data[1].trim();
                    double gpa = Double.parseDouble(data[2].trim());
                    String major = data[3].trim();
                    
                    
                    students.add(new Student(id, name, gpa, major));
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