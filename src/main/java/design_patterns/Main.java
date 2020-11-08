package design_patterns;

import lombok.SneakyThrows;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
//        DistributionService distributionService = new DistributionService();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        DistributionService distributionService = context.getBean(DistributionService.class);
        while (true){
            distributionService.sendMail();
            Thread.sleep(500);
        }

    }
}
