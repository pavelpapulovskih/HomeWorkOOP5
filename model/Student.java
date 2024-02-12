package model;

public class Student extends User {

    @Override
    public String toString() {
        return "{" +
            " studentId='" + getStudentId() + "'" +
            "}";
    }

    private int studentId;

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Student(String firstName, String lastName, String middleName, int studentId) {
        super(firstName, lastName, middleName);
        this.studentId = studentId;
    }

    public static Student getStudentById(int studentId2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentById'");
    }
    
}
