package lab2;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ольга on 07.04.2015.
 */
public class StringBuilderFactoryBeanTest {
    @Test
    public void  testFactoryBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context2.xml");
        StringBuilder bean = context.getBean(StringBuilder.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals(bean.getClass(), StringBuilder.class);
    }
}
