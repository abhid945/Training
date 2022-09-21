import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean.xml");
        Director director = (Director) applicationContext.getBean("director1");
        director.display();
        Director director1 = (Director) applicationContext.getBean("director2");
        director1.display();
    }
}
