package design_patterns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DistributionService {
   public static Map<Integer, Mail> mails = new HashMap<>();

    @Autowired
    public void setMails(List<Mail> mailList){
        mailList.forEach(mail->mails.put(mail.getClass().getAnnotation(TemplateCode.class).value(),mail));
    }
    public void sendMail(){
        int mailCode = DBUtils.getMailCode();
        mails.get(mailCode).sendMail();
    }
}

