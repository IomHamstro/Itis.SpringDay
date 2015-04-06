package lab05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ольга on 06.04.2015.
 */
public class ProxyTest {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();

        Subject subject = context.getBean(Subject.class);
        subject.longMethod();
    }
}
