package lab4;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class QuoterTest {
    @Test
    public void testSayQuote() throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("lab4");
        Map<String,Quoter> beans = context.getBeansOfType(Quoter.class);
        Assert.assertEquals(2,beans.size());
        Assert.assertEquals("I'll be back",beans.get("terminatorQuoter").sayQuote());
    }
}