package lab6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Ольга on 07.04.2015.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "lab6")
public class AppConfig {
}
