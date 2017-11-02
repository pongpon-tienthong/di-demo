package pongpon.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pongpon.springframework.controllers.ConstructorInjectedController;
import pongpon.springframework.controllers.GetterInjectedController;
import pongpon.springframework.controllers.MyController;
import pongpon.springframework.controllers.PropertyInjectedController;
import pongpon.springframework.fakes.FakeDataSource;
import pongpon.springframework.fakes.JmsFakeDataSource;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) context.getBean(FakeDataSource.class);
        JmsFakeDataSource jsmFakeDataSource = (JmsFakeDataSource) context.getBean(JmsFakeDataSource.class);

        System.out.println(fakeDataSource.getUsername());
        System.out.println(jsmFakeDataSource.getUsername());
    }
}
