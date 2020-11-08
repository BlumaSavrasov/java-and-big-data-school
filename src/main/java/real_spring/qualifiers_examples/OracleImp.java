package real_spring.qualifiers_examples;

import static real_spring.qualifiers_examples.DBType.ORACLE;

@DeutschBank(ORACLE)
public class OracleImp implements Dao {
    @Override
    public void saveAll() {
        System.out.println("Saving to ORACLE");
    }
}
