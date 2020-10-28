package real_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Quoter shakeSpearQuoter = (Quoter) context.getBean("shakeSpearQuoter",Quoter.class);
        shakeSpearQuoter.sayQuote();
       Quoter terminatorQuoter = (TerminatorQuoter) context.getBean("terminatorQuoter");
       terminatorQuoter.sayQuote();
    }
}
