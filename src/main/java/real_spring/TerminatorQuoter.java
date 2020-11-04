package real_spring;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Setter
@Component
//@DeprecatedClass(newClass = T1000.class)
public class TerminatorQuoter implements Quoter {
    List<String> messages;
    @Value("${terminator}")
    public void setMessages(String[] messages) {
        this.messages = Arrays.asList(messages);
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }
}
