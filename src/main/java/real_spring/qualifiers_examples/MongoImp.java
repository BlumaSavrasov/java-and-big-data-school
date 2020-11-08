package real_spring.qualifiers_examples;

import static real_spring.qualifiers_examples.DBType.MONGO;

@DeutschBank(MONGO)
public class MongoImp implements Dao {
    @Override

    public void saveAll() {
        System.out.println("Saving to MONGO");
    }
}
