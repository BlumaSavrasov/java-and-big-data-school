package real_spring;

import lombok.Setter;

import java.util.List;
@Setter
public class TalkingRobot implements Talking {
    List<Quoter> quoters;
    @Override
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }
}
