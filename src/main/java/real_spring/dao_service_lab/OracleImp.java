package real_spring.dao_service_lab;

import static real_spring.dao_service_lab.DBType.ORACLE;

@DeutschBank(ORACLE)
public class OracleImp implements Dao {
    @Override
    public void saveAll() {
        System.out.println("Saving to ORACLE");
    }
}
