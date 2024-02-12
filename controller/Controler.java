package controller;

import java.util.ArrayList;
import java.util.List;


import model.User;
import model.Student;
import model.StudyGroups;
import model.StudyGroupsService;
import model.Teacher;
import model.Type;
import service.DataService;
import view.StudentView;

public class Controler {
    
    private DataService service = new DataService();

    private final StudentView view = new StudentView();

    public void craeateStudent(String firstName, String lastName, String middleName){
        service.craeate(firstName, lastName, middleName, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            Student student =(Student)user;
            view.printOnConsole(user);
        }
    }

    private StudyGroupsService studyGroupsService;

    public Controler() {
        studyGroupsService = new StudyGroupsService();
    }

    public StudyGroups createStudyGroup(int teacherId, List<Integer> studentIds) {
        Teacher teacher = Teacher.getTeacherById(teacherId);
        List<Student> students = new ArrayList<>();
        
        for (int studentId : studentIds) {
        Student student = Student.getStudentById(studentId);
        students.add(student);
        }
        
        return studyGroupsService.createStudyGroup(teacher, students);
        }
}
