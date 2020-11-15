package Enrollment;
import StudentInfo.*;

public class UnderGraduateClass extends CLass {
    
    final static public int maxStudents = 40;
    
    // IIB: Instance Initializer Block
    {
        studentsList = new Student[maxStudents];
    }
    
    public UnderGraduateClass(){}  
    
    public UnderGraduateClass(String classID, Course course){
        super(classID, course);
    }
}
