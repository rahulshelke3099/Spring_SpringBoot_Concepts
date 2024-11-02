package rahul.springJdbcDemo.service;
/**

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rahul.springJdbcDemo.model.Student;
import rahul.springJdbcDemo.repo.StudentRepo;

import java.util.List;

//When to Use Each:
//Use JDBC Template if:
//
//You need full control over SQL and database interaction.
//Performance is critical and ORM overhead is a concern.
//You are working with a simple or legacy database schema that doesn’t involve complex relationships.
//Use JPA if:
//
//Your application has a complex domain model with many entity relationships.
//You want to avoid writing a lot of SQL manually.
//You need features like caching, automatic transaction management, or the ability
//to easily switch database vendors.
//You prefer an object-oriented approach over a SQL-based one.
//
//        In summary, JDBC Template provides more fine-grained control and is suited for
//simpler applications or where performance tuning is necessary, while JPA offers higher abstraction and is better suited for complex applications with rich object models and relationships.
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
**/