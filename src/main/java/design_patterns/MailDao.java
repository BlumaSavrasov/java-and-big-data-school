package design_patterns;

import org.springframework.stereotype.Repository;

import java.util.Random;
@Repository
public class MailDao {
    private static Random random=new Random();
    public int getMailCode() {
        return random.nextInt(2)+1;
    }
}
