package design_patterns;

import org.springframework.stereotype.Component;

@TemplateCode(2)
@Component
public class DoNotCallUsMail implements Mail {
    @Override
    public void sendMail() {
        //40 lines
        System.out.println("don't call us we'll call you");
    }
}
