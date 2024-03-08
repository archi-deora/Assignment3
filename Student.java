public class Student {
    private int rollNumber;
    private String name;
    private String admissionDate;
//Student.java
    public Student(int rollNumber, String name, String admissionDate) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.admissionDate = admissionDate;
    }

    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Admission Date: " + admissionDate);
    }
}