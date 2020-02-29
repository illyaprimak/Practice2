import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBean.xml");
        HelloWorld helloWorld =(HelloWorld)applicationContext.getBean("helloBean");

        helloWorld.printHello();
        helloWorld.printLines();
    }
}
