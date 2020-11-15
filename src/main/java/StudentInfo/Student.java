package StudentInfo;
import Enrollment.*;

public class Student {
    protected String studentID;
    protected String fullName;
    
    protected int k;    // Khóa
    protected String department;
    protected Address address;  // Composition
    
    // Constructor
    public Student(){}
    
    // Constructor
    public Student(String studentID, String fullName, int k, String department, Address address){
        this.studentID = studentID;
        this.fullName = fullName;
        this.k = k;
        this.department = department;
        this.address = address;
    }

    // Đăng ký môn học
    public void enroll(CLass c){
        c.addStudent(this);
        
        System.out.print(" -> " + studentID + "  " + fullName + " enrolls: ");
        c.printClassInfo();
    }
    
    // Overriden: In thông tin của sinh viên
    public void printStudent(){}
    
    // Setters
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }
    
    // Getters
    public String getStudentID(){
        return studentID;
    }
    
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    
    public String getFullName(){
        return fullName;
    }
    
    public void setK(int k){
        this.k = k;
    }
    
    public int getK(){
        return k;
    }
    
    public void setDepartment(String department){
        this.department = department;
    }
    
    public String getDepartment(){
        return department;
    }
    
    public void setAddress(String no, String street, String district, String city){
        address.setNo(no);
        address.setStreet(street);
        address.setDistrict(district);
        address.setCity(city);
    }
    
    public void setAddress(Address address){
        this.address = address;
    }
    
    public Address getAddress(){
        return address;
    }
}
