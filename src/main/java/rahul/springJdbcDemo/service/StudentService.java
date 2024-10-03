package rahul.springJdbcDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rahul.springJdbcDemo.model.Student;
import rahul.springJdbcDemo.repo.StudentRepo;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s ) {
        repo.save(s);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
