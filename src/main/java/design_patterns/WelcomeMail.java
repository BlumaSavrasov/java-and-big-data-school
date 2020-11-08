package design_patterns;

import org.springframework.stereotype.Component;

@TemplateCode(1)
@Component
public class WelcomeMail implements Mail {
    @Override
    public void sendMail() {
        //20 lines of code
        System.out.println("Welcome to our company");
    }
}
