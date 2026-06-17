import java.util.ArrayList;

class Student{
    private String studentName;
    private double studentID;
    private ArrayList<Courses> registeredCoursesList;

    Student(String studentName, double studentID){
        this.studentName = studentName;
        this.studentID = studentID;
        this.registeredCoursesList = new ArrayList<Courses>();
    }

    void registerCourses(Course course){
        if (registeredCoursesList.size() >= course.getMaxStudent()){

        }
    }


}
class Course{
    private String courseName;
    private String teacherName;
    private int maxStudent;
    private ArrayList<Student> studentRegistered;

    Course(String courseName, String teacherName){
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.maxStudent = 3;
        this.studentRegistered = new ArrayList<Student>();
    }
    int getMaxStudent(){
        return this.maxStudent;
    }

}