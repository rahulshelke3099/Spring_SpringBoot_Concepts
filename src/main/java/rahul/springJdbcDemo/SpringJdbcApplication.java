package rahul.springJdbcDemo;

//Spring JdbcTemplate is a powerful mechanism to connect to the database and execute SQL queries.
//        It internally uses JDBC api,
//        but eliminates a lot of problems of JDBC API.
//
//        Problems of JDBC API
//        The problems of JDBC API are as follows:
//
//
//        We need to write a lot of code before and after executing the query,
//        such as creating connection,statement,closing resultset,connection etc.
//        We need to perform exception handling code on the database logic.
//        We need to handle transaction.
//        Repetition of all these codes from one to another database logic is a time consuming task.
//
//
//        Advantage of Spring JdbcTemplate
//        Spring JdbcTemplate eliminates all the above mentioned problems of JDBC API.
//        It provides you methods to write the queries directly,so it saves a lot of work and time.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import rahul.springJdbcDemo.model.Student;

@SpringBootApplication
public class SpringJdbcApplication {
    public static void main(String[] args) {
     ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class);

     Student s = context.getBean(Student.class);
     s.setName("rahul");
     s.setMarks(100);
     s.setRollno(1);
    }
}
