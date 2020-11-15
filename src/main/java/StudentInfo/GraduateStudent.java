package StudentInfo;
import Enrollment.*;

public class GraduateStudent extends Student {
    // Chuyên ngành: thông tin riêng của GraduateStudent
    private String speciality;
    
    // Constructor
    public GraduateStudent(){}
    
    // Constructor
    public GraduateStudent(String studentID, String fullName, int k, String department, Address address, String speciality){
        super(studentID, fullName, k, department, address);
        this.speciality = speciality;
    }    
    
    @Override
    public void printStudent(){
        System.out.println("    " + studentID + "    " + fullName + "    " + speciality + "   " + k + "   " + department + " " + address.toStringAddress());
    }
}
