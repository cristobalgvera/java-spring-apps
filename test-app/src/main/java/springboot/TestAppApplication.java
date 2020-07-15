package springboot;

import com.fullstack.testapp.controllers.services.EmployeesController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.fullstack.testapp")
public class TestAppApplication {

    @Autowired
    public static void main(String[] args) {
        SpringApplication.run(TestAppApplication.class, args);
//        ApplicationContext applicationContext = SpringApplication.run(TestAppApplication.class, args);
//        EmployeesController employeesController = (EmployeesController) applicationContext.getBean("employeesController");
//        System.out.println(employeesController.getEmployee().getReport().readReport());
    }

}
