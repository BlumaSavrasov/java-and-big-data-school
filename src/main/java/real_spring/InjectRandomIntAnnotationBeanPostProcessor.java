package real_spring;

import lombok.SneakyThrows;
import my_spring.InjectRandomIntObjectConfigurator;
import my_spring.ObjectConfigurator;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


@Component
public class InjectRandomIntAnnotationBeanPostProcessor implements BeanPostProcessor {

    private ObjectConfigurator configurator=new InjectRandomIntObjectConfigurator() ;
    @SneakyThrows
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        configurator.configure(bean,null);
        return bean;
    }
}
