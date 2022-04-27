package main.java.space.jdbcTemplate_Student;

import main.java.space.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.Reader;

public class MainProgram {

    public static void main(String[] args) {
        ApplicationContext ctx=new
                ClassPathXmlApplicationContext("spring-config.xml");

        StudentDAO dao=(StudentDAO)ctx.getBean("stuDAO");

        Student stu1=new Student();
        stu1.setStuid(1101);
         stu1.setStuname("Kelsey");
         stu1.setCourseid(99);

         int x=dao.saveStuRecord(stu1);
         if(x>0)
          System.out.println("--- Record Inserted --- ");

//        stu1.setStuid(11);
//        stu1.setStuname("Allen");
//        stu1.setCourseid(111);
//
//        int x=dao.updateStuRecord(stu1);
//        if(x>0)
//            System.out.println("--- Record Updated  --- ");
    }

}
