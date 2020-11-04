package real_spring;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class DeprecatedClassAnnotationBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    @SneakyThrows
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        String[] names = configurableListableBeanFactory.getBeanDefinitionNames();
        for (String name : names) {
            BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition(name);
            DeprecatedClass annotation = Class.forName(beanDefinition.getBeanClassName()).getAnnotation(DeprecatedClass.class);
            if(annotation!=null){
                configurableListableBeanFactory.getBeanDefinition(name).setBeanClassName(annotation.newClass().getName());
            }


        }
    }
}
