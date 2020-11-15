package Enrollment;
import StudentInfo.*;

public class CLass {
    protected String classID;
    protected Course course;    // Composition
    protected Student [] studentsList;  // Danh sách sinh viên đăng ký
    protected int nStudents;    // Số lượng SV đăng ký lớp
    
    public CLass(){
        nStudents = 0;
    }
    
    public CLass(String classID, Course course){
        this.classID = classID;
        this.course = course;
        nStudents = 0;
    }
    
    // Thêm một SV đăng ký vào trong danh sách lớp
    public void addStudent(Student student){
        studentsList[nStudents++] = student;
    }
    
    public void printClassInfo(){
        System.out.println(classID + "  " + course.toStringCourse());
    }
    
    public void printClassList(){
        System.out.println(classID + "  " + course.toStringCourse() + "  " + nStudents + " students:");
        
        for (int i = 0; i < nStudents; i++){
            studentsList[i].printStudent();
        }
    }
    
    public int getnStudents(){
        return nStudents;
    }
}
