
package repository;

import data_access.StudentDao;
import java.util.List;
import model.Student;


public class StudentRepository implements IStudentRepository {
    @Override
    public void adding(List<Student> students, Student new_student){
        StudentDao.Instance().adding(students, new_student);
    }
    
    @Override
    public void display(List<Student> students){
        StudentDao.Instance().display(students);
    }
}