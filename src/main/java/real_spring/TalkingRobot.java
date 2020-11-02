package real_spring;

import lombok.Setter;
import my_spring.InjectRandomInt;

import javax.annotation.PostConstruct;
import java.util.List;
@Setter
public class TalkingRobot implements Talking {
    private List<Quoter> quoters;
    @InjectRandomInt(min= 1,max = 3)
    int repeat;
    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
        System.out.println(repeat);
    }
}
