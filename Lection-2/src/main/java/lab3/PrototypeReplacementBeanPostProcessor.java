package lab3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by Ольга on 07.04.2015.
 */
public class PrototypeReplacementBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        Method[] methods = bean.getClass().getMethods();
//        Arrays.stream(methods).filter(method -> method.getName().startWith("get"));
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
