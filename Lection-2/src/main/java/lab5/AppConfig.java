package lab5;

import lab2.StringBuilderFactoryBean;
import lab3.RandomQuoter;
import lab3.Robot;
import lab4.Quoter;
import lab4.TerminatorQuoter;
import org.omg.CORBA.BAD_QOS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by Ольга on 07.04.2015.
 */
@Configuration
@PropertySource("classpath:file.properties")
public class AppConfig {

    @Value("${fileName}")
    private String fileName;
    @Autowired
    private StringBuilder stringBuilder;

    @Bean
    @DependsOn("fileCreator")
    public FileConsumer fileConsumer(){
        return new FileConsumer(fileName);}

    @Bean
    public FileCreator fileCreator(){return new FileCreator(fileName);}

    @Bean
    PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public StringBuilder stringBuilder(){
        return new StringBuilder("Start ").append("Middle ").append("Finish.");
    }

    @Bean
    public Quoter terminatorQouter(){
        return new CustomQuoter(stringBuilder);
    }

    @Bean
    public lab4.Robot robot(){
        lab4.Robot robot = new lab4.Robot();
        robot.setQuoter(terminatorQouter());
        return robot;
    }
}
