package design_patterns;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        DistributionService distributionService = new DistributionService();
        while (true){
            distributionService.sendMail();
            Thread.sleep(500);
        }

    }
}
