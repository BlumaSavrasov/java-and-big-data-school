package design_patterns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DistributionService {
    public static Map<Integer, Mail> mails =new HashMap<>();
    @Autowired
    private MailDao mailDao;

    @Autowired
    public void setMails(List<Mail> mailList){
        mailList.forEach(mail->mails.put(mail.getClass().getAnnotation(TemplateCode.class).value(),mail));
    }
    public void sendMail(){
        int mailCode=mailDao.getMailCode();
        mails.get(mailCode).sendMail();
    }
}

