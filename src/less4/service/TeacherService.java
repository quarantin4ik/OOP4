package less4.service;

import less4.model.Teacher;

public class TeacherService {
    public Teacher createTeacher(int id, String name, String last) {
        return new Teacher(id, name, last);
    }
}
