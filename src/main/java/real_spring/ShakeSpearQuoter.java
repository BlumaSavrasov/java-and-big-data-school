package real_spring;

import lombok.Data;

@Data
public class ShakeSpearQuoter implements Quoter {
    public String message;
    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}
