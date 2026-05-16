/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roejg
 */
public class Student extends Person{
    
    private Department department;   
    private double gpa;
    private int year;

    public Student(String name, String id, int age, Department department, double gpa, int year) {
        super(name, id, age); 
        this.department = department;
        this.gpa = gpa;
        this.year = year;
    }

    
    public Department getDepartment() { return department; }
    public double getGpa() { return gpa; }
    public int getYear() { return year; }

    public void setDepartment(Department department) { this.department = department; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    public void setYear(int year) { this.year = year; }

    @Override
    public String toString() {
        return "Student: " + getName() +
               ", ID: " + getId() +
               ", Age: " + getAge() +
               ", Department: " + department +
               ", GPA: " + gpa +
               ", Year: " + year;
   
}
}