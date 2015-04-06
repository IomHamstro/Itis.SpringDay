package lab04;

import lab01.RunThisMethod;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Ольга on 06.04.2015.
 */
public class RunThisMethodBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BPP runs on " + beanName +"!");
        try {
            for (Method method : bean.getClass().getMethods()) {
                RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
                if (annotation != null) {
                    int repeat = annotation.repeat();
                    for (int j = 0; j < repeat; j++) {
                        method.invoke(bean);
                    }
                }
            }
            return bean;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
