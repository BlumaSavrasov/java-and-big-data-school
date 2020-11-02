package real_spring;

import lombok.Setter;

import java.util.List;
@Setter
@DeprecatedClass(newClass = T1000.class)
public class TerminatorQuoter implements Quoter {
    List<String> messages;
    @Override
    public void sayQuote() {
        messages.stream().forEach(message-> System.out.println(message));
    }
}
