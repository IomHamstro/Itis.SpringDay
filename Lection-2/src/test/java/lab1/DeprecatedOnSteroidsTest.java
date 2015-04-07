package lab1;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ольга on 07.04.2015.
 */
public class DeprecatedOnSteroidsTest {
    @Test
    public void testDe(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean("replacedBean");
    }

}
