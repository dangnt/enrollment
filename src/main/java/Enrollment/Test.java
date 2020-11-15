package Enrollment;
import StudentInfo.*;

public class Test {
    public static void main(String [] args){
        Course course1 = new Course("CS-DH-01", "Logic Programming", 4);
        Course course2 = new Course("CS-CH-01", "Advanced Intelligence", 3);
        
        // Lớp Đại học
        UnderGraduateClass uClass = new UnderGraduateClass("DH.CS.2020.001", course1);
        // Lớp Cao học
        GraduateClass gClass = new GraduateClass("CH.CS.2020.001", course2);
        
        UnderGraduateStudent uStudent;
        
        uStudent = new UnderGraduateStudent("DH.2018.0001", "Nguyen Van An", 2018, "CS", new Address("10", "Nguyen Du", "1", "HCM"), "CS");
        uClass.addStudent(uStudent);
        
        uStudent = new UnderGraduateStudent("DH.2018.0002", "Pham Binh", 2018, "CS", new Address("100/20", "Hung Vuong", "5", "HCM"), "IT");
        uClass.addStudent(uStudent);
        
        uStudent = new UnderGraduateStudent("DH.2018.0003", "Tran Dat", 2018, "CS", new Address("230", "Ly Thuong Kiet", "11", "HCM"), "IS");
        uClass.addStudent(uStudent);
        
        uClass.printClassList();
        
        //---------------------------------------------------------------------
        GraduateStudent gStudent;
        
        gStudent = new GraduateStudent("CH.2018.0001", "Le Thi Bich", 2018, "CS", new Address("324/5/43", "Truong Chinh", "Tan Binh", "HCM"), "AI");
        //gClass.addStudent(gStudent);
        gStudent.enroll(gClass);
        
        gStudent = new GraduateStudent("CH.2018.0002", "Nguyen Van Tuan", 2018, "CS", new Address("305", "Nam Ky Khoi Nghia", "3", "HCM"), "NLP");
        //gClass.addStudent(gStudent);
        gStudent.enroll(gClass);
        
        gClass.printClassList();
        
        
    }
}
