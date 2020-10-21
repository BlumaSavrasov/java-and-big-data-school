package design_patterns;

import java.util.Map;

public class
DistributionService {
   public static Map<Integer, Mail> mails = Map.of(1, new WelcomeMail(), 2, new DoNotCallUsMail());
    public void sendMail(){
        int mailCode = DBUtils.getMailCode();
        mails.get(mailCode).sendMail();
    }
}

