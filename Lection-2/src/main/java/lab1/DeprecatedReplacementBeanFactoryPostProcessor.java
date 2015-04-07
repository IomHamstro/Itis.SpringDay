package lab1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * Created by Ольга on 07.04.2015.
 */
public class DeprecatedReplacementBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefiinitionNames = beanFactory.getBeanDefinitionNames();
        for (String beanDefiinitionName : beanDefiinitionNames) {
            GenericBeanDefinition beanDefinition = ( GenericBeanDefinition) beanFactory.getBean(beanDefiinitionName);
            DeprecatedOnSteroids deprecatedOnSteroids = null;
            try {
                deprecatedOnSteroids = Class.forName(beanDefiinitionName).getAnnotation(DeprecatedOnSteroids.class);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if(deprecatedOnSteroids !=null){
                beanDefinition.setBeanClass(deprecatedOnSteroids.replaceWith());
            }
        }
    }
}
