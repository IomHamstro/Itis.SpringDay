package lab3;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpeakingRobotTest {
    @Test
    public void testRandomQuoters() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SpeakingRobot robot = context.getBean(SpeakingRobot.class);
        Assert.assertNotEquals(robot.speak(),robot.speak());
    }
}