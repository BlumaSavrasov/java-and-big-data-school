package real_spring.labs;


@Oracle
public class OracleImp implements Dao {
    @Override
    public void saveAll() {
        System.out.println("This is OracleImp");
    }
}
