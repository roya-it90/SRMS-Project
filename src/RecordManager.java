/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author roejg
 */
public class RecordManager {
    private ArrayList<Student> students;

    public RecordManager() {
        students = new ArrayList<>();
    }

   
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully.");
    }

   
    public boolean removeStudent(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                students.remove(s);
                System.out.println("Student removed successfully.");
                return true;
            }
        }
        System.out.println("Student not found.");
        return false;
    }
      
    public boolean updateStudent(String id, Student newData) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.set(i, newData);
                System.out.println("Student updated successfully.");
                return true;
            }
        }
        System.out.println("Student not found.");
        return false;
    }

   
    public Student searchStudent(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

   
    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    
    public ArrayList<Student> getStudents() {
        return students;
    }
}
