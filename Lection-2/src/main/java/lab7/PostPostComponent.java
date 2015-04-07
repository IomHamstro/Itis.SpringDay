package lab7;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Ольга on 07.04.2015.
 */
@Component
public class PostPostComponent {

    @PostConstruct
    public void postConstruct(){
        System.out.println("I'm post construct");
    }

    @PostInitialized
    public void postInitialize(){
        System.out.println("'I'm post initialize");
    }
}
