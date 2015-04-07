package lab07;

import lab05.Subject;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ольга on 06.04.2015.
 */
public class BppTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context07.xml");
        Subject subject = context.getBean(Subject.class);
        subject.longMethod();
    }
}
