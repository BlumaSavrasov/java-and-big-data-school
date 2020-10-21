package design_patterns;
@TemplateCode(2)
public class DoNotCallUsMail implements Mail {
    @Override
    public void sendMail() {
        //40 lines
        System.out.println("don't call us we'll call you");
    }
}
