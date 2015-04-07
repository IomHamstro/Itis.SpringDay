package lab02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.String; /**
 * Created by Ольга on 06.04.2015.
 */
public class QuoterTest {

    public static void main(String[]args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Quoter shakespeareQuoter = context.getBean(Quoter.class);
        shakespeareQuoter.sayQuote();

    }
}
