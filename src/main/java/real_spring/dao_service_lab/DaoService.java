package real_spring.dao_service_lab;

import org.springframework.stereotype.Service;


import javax.annotation.PostConstruct;

import static real_spring.dao_service_lab.DBType.MONGO;
import static real_spring.dao_service_lab.DBType.ORACLE;

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

