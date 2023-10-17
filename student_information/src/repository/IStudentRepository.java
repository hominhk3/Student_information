package repository;

import java.util.List;
import model.Student;

public interface IStudentRepository {

    void adding(List<Student> students, Student new_student);

    void display(List<Student> students);

}