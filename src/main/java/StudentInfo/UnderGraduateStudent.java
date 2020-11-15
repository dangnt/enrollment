package StudentInfo;
import Enrollment.*;

public class UnderGraduateStudent extends Student {
    // Ngành học: riêng của UnderGraduateStudent
    private String major;
    
    // Constructor
    public UnderGraduateStudent(){}
    
    // Constructor
    public UnderGraduateStudent(String studentID, String fullName, int k, String department, Address address, String major){
        super(studentID, fullName, k, department, address);
        this.major = major;
    }
    
    @Override
    public void printStudent(){
        System.out.println("    " + studentID + "    " + fullName + "    " + major + "   " + k + "   " + department + "  " + address.toStringAddress());
    }
}
