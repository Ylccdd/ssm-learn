package main.java.space.jdbcTemplate_Student;

import main.java.space.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAO
{
    JdbcTemplate jdbcTemplate;
    public StudentDAO()  //default constructor
    {
        super();
    }
    //parametrized constructor
    public StudentDAO(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate=jdbcTemplate;
    }
    //getter and setter
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    //write the methods to work with data from database
//insert a new row
    public int saveStuRecord(Student stu)
    {
        //varchar 类型一定要用单引号隔开
        String query="insert into student(stuid,stuname,courseid) values"
                +"("+stu.getStuid()+", ' "+stu.getStuname()+" ' ,"+stu.getCourseid()+")";
        //返回的是受sql语句影响的行数
        return jdbcTemplate.update(query);
    }
    public int updateStuRecord(Student stu)
    {
        String query="update student set stuname=' "+stu.getStuname()+" ' ,"
                +"course="+stu.getCourseid()+" where stuid="+stu.getStuid();
        return jdbcTemplate.update(query);
    }
}
