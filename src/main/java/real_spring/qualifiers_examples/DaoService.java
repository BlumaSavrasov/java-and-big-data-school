package real_spring.qualifiers_examples;

import org.springframework.stereotype.Service;


import javax.annotation.PostConstruct;

import static real_spring.qualifiers_examples.DBType.MONGO;
import static real_spring.qualifiers_examples.DBType.ORACLE;

@Service
public class DaoService {
    @DeutschBank(ORACLE)
    private Dao oracleImp;
    @DeutschBank(MONGO)
    private Dao mongoImp;
    @PostConstruct
    public void service(){
        oracleImp.saveAll();
        mongoImp.saveAll();
    }


}

