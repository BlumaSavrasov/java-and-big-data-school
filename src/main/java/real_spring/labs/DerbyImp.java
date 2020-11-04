package real_spring.labs;

@Derby
public class DerbyImp implements Dao {
    @Override
    public void saveAll() {
        System.out.println("This is DerbyImp");
    }
}
