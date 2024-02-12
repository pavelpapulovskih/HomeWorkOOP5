package model;

import java.util.List;

public class StudyGroupsService {
    public StudyGroups createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroups(teacher, students);
    }
}

