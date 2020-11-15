package Enrollment;
import StudentInfo.*;

public class GraduateClass extends CLass {
    
    final static public int maxStudents = 25;
    
    {
        studentsList = new Student[maxStudents];
    }
    
    public GraduateClass(){}
    
    public GraduateClass(String classID, Course course){
        super(classID, course);
    }
}
