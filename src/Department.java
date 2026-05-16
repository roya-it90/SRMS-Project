/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roejg
 */
public class Department {
    
    private String deptName;
    private String deptCode;

    public Department(String deptName, String deptCode) {
        this.deptName = deptName;
        this.deptCode = deptCode;
    }

    public String getDeptName() { return deptName; }
    public String getDeptCode() { return deptCode; }

    public void setDeptName(String deptName) { this.deptName = deptName; }
    public void setDeptCode(String deptCode) { this.deptCode = deptCode; }

    @Override
    public String toString() {
        return deptName + " (" + deptCode + ")";
    }
}
