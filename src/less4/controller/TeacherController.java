package less4.controller;

import java.util.ArrayList;
import java.util.List;

import less4.model.Teacher;
import less4.model.User;

public class TeacherController implements UserController{

    @Override
    public <T extends User> User create(T user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }
    
    private List<Teacher> teachers = new ArrayList<>();

    public void createTeacher(int id, String name, String lastname) {
        Teacher teacher = new Teacher(id, name, lastname);
        addTeacher(teacher);
    }

    public void editTeacher(int id, String name, String lastName) {
        for (Teacher t : teachers) {
            if (t.getId() == id) {
                t.setName(name);
                t.setLastName(lastName);
                return;
            }
        }
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void displayTeachers() {
        for (Teacher teacher : teachers) {
            System.out.println("ID: " + teacher.getId() + ", Name: " + teacher.getName() + " " + teacher.getLastName());
        }
    }

}
