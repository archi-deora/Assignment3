// The lines `import java.util.ArrayList;` and `import java.util.List;` are importing specific classes
// from the `java.util` package.
import java.util.ArrayList;
import java.util.List;

class Student {
    // The `@SuppressWarnings("unused")` annotation is used in Java to suppress compiler warnings. In
    // this case, it is likely used to suppress warnings about the fields `studentId`, `name`,
    // `program`, `semester`, and `courses` being declared but not directly used within the `Student`
    // class. This annotation tells the compiler to ignore the warning related to these fields being
    // unused.
    @SuppressWarnings("unused")
    private int studentId;
    private String name;
    private String program;
    private String semester;
    private List<Course> courses;

   // This `public Student(int studentId, String name, String program, String semester)` constructor in
   // the `Student` class is initializing a new instance of the `Student` class with the provided
   // parameters `studentId`, `name`, `program`, and `semester`.
    public Student(int studentId, String name, String program, String semester) {
        this.studentId = studentId;
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new ArrayList<>();
    }
/**
 * The `registerCourse` function adds a course to a list of courses.
 * 
 * @param course The `registerCourse` method takes a `Course` object as a parameter. This `Course`
 * object represents the course that you want to register.
 */

    public void registerCourse(Course course) {
        courses.add(course);
    }

    // Getters for student information
    /**
     * The `getName` function in Java returns the value of the `name` variable.
     * 
     * @return The `name` variable is being returned.
     */
    public String getName() {
        return name;
    }

   /**
    * This Java function returns the program string.
    * 
    * @return The `program` variable is being returned.
    */
    public String getProgram() {
        return program;
    }

   /**
    * The function `getSemester()` returns the semester value.
    * 
    * @return The method `getSemester()` is returning the value of the variable `semester`.
    */
    public String getSemester() {
        return semester;
    }

    public List<Course> getCourses() {
        return courses;
    }
}

class Course {
    // The code snippet `private String courseCode; private String courseName; private List<Student>
    // students;` is defining the attributes of the `Course` class.
    private String courseCode;
    private String courseName;
    private List<Student> students;

   // This code snippet is defining a constructor for the `Course` class in Java. The constructor takes
   // two parameters, `courseCode` and `courseName`, which are used to initialize the `courseCode` and
   // `courseName` attributes of a `Course` object. Additionally, it initializes the `students`
   // attribute as a new `ArrayList` to store the students enrolled in the course.
    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    /**
     * The addStudent function adds a Student object to a list of students.
     * 
     * @param student The parameter `student` is an object of type `Student` that you want to add to a
     * list of students.
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    // Getters for course information
   /**
    * This Java function returns the course code as a String.
    * 
    * @return The method `getCourseCode()` is returning the value of the variable `courseCode`.
    */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * The `getCourseName` function in Java returns the course name.
     * 
     * @return The method `getCourseName()` is returning the value of the variable `courseName`.
     */
    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return students;
    }
}
public class Studcourse {
    public static void main(String[] args) {
        
        Student student1 = new Student(101, "Alice", "Computer Science", "Spring 2024");
        Student student2 = new Student(102, "Bob", "Electrical Engineering", "Spring 2024");

        // Create courses
        Course course1 = new Course("CS101", "Introduction to Programming");
        Course course2 = new Course("EE201", "Digital Circuits");

        // Register students for courses
        student1.registerCourse(course1);
        student2.registerCourse(course2);

        // Retrieve student information
        System.out.println(student1.getName() + " (" + student1.getProgram() + ", " + student1.getSemester() + ") is registered for:");
        for (Course course : student1.getCourses()) {
            System.out.println("- " + course.getCourseName());
        }

        System.out.println(student2.getName() + " (" + student2.getProgram() + ", " + student2.getSemester() + ") is registered for:");
        for (Course course : student2.getCourses()) {
            System.out.println("- " + course.getCourseName());
        }
    }
}