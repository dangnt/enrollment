package Enrollment;

public class Course {
    protected String courseID;
    protected String courseName;
    protected int credits;
    
    public Course(String courseID, String courseName, int credits){
        this.courseID = courseID;
        this.courseName = courseName;
        this.credits = credits;
    }
    
    public String toStringCourse(){
        return courseID + " " + courseName + " (" + credits + " credits)";
    }
    
    public String getCourseID(){
        return courseID;
    }
    
    public String getCourseName(){
        return courseName;
    }
}
