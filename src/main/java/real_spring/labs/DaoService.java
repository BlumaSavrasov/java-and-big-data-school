package real_spring.labs;

import org.springframework.stereotype.Service;


import javax.annotation.PostConstruct;

@Service
public class DaoService {
    @Oracle
    private Dao oracleImp;
    @Derby
    private Dao derbyImp;
    @PostConstruct
    public void service(){
        oracleImp.saveAll();
        derbyImp.saveAll();
    }


}

