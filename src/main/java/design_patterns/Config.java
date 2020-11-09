package design_patterns;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
@ComponentScan
public class Config {
        @SneakyThrows
        public static void main(String[] args) {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
            DistributionService distributionService = context.getBean(DistributionService.class);
            while (true){
                distributionService.sendMail();
                Thread.sleep(500);
            }
        }
}

