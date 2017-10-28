package pongpon.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pongpon.springframework.controllers.ConstructorInjectedController;
import pongpon.springframework.controllers.GetterInjectedController;
import pongpon.springframework.controllers.MyController;
import pongpon.springframework.controllers.PropertyInjectedController;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");

        System.out.println(myController.hello());
        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(GetterInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
    }
}
