package real_spring;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ShakeSpearQuoter implements Quoter {
    @Value("${shake}")
    public String message;
    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}
