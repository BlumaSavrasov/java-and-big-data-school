package real_spring.dao_service_lab;

import static real_spring.dao_service_lab.DBType.MONGO;

@DeutschBank(MONGO)
public class MongoImp implements Dao {
    @Override

    public void saveAll() {
        System.out.println("Saving to MONGO");
    }
}
