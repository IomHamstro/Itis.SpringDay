package lab03;

import lab02.Quoter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ольга on 06.04.2015.
 */
public class RobotTest {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        System.out.println(context.getBean(Robot.class).toString());
    }
}
