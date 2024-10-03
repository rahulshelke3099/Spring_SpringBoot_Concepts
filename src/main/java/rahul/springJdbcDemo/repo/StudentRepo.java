package rahul.springJdbcDemo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import rahul.springJdbcDemo.model.Student;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    public void save(Student s) {
        System.out.println("Added");
        String sql="insert into student(rollno,name,marks) values(?,?,?)";
        int rows =jdbc.update(sql,s.getRollno(),s.getName(),s.getMarks());
        System.out.println("Number of rows affected : " + rows);
    }

    public List<Student> findAll() {
       List<Student> students = new ArrayList<>();
        return students;
    }
}
