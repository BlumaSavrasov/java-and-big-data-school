package real_spring;

import lombok.Setter;

import java.util.List;
@Setter
public class TerminatorQuoter implements Quoter {
    List<String> messages;
    @Override
    public void sayQuote() {
        messages.stream().forEach(message-> System.out.println(message));
    }
}
