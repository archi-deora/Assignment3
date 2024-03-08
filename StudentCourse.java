public class StudentCourse extends Student {
    private String courseName;
    private int marks;

    public StudentCourse(int rollNumber, String name, String admissionDate, String courseName, int marks) {
        super(rollNumber, name, admissionDate);
        this.courseName = courseName;
        this.marks = marks;
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        // Example usage
        StudentCourse mathStudent = new StudentCourse(101, "John Doe", "2024-03-07", "Math", 90);
        mathStudent.displayStudentInfo();
        mathStudent.displayCourseInfo();

        StudentCourse historyStudent = new StudentCourse(102, "Jane Smith", "2024-03-07", "History", 85);
        historyStudent.displayStudentInfo();
        historyStudent.displayCourseInfo();
    }
}


    