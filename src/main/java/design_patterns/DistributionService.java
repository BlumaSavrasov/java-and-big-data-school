package design_patterns;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DistributionService {
   public static Map<Integer, Mail> mails = new HashMap<>();
   @SneakyThrows
   public DistributionService(){
       Reflections scanner = new Reflections("design_patterns");
       Set<Class<? extends Mail>> subTypesOf = scanner.getSubTypesOf(Mail.class);
       for (Class<? extends Mail> aClass : subTypesOf) {
           if(!Modifier.isAbstract(aClass.getModifiers())) {
               TemplateCode annotation = aClass.getAnnotation(TemplateCode.class);
               int value = annotation.value();
               Mail mail = aClass.getDeclaredConstructor().newInstance();
               mails.put(value, mail);
           }
       }


   }
    public void sendMail(){
        int mailCode = DBUtils.getMailCode();
        mails.get(mailCode).sendMail();
    }
}

