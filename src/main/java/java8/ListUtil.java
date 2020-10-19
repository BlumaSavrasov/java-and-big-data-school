package java8;

import lombok.SneakyThrows;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ListUtil<T> {
    public static <T> int countDuplicate(T t, List<T> list, Equalator<T> equalator) {

        int counter = 0;
        for (T t1 : list) {
            if (equalator.equals(t1, t))
                counter++;
        }
        return counter;
    }
    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> function) {
        for (T t : list) {
            function.accept(t);
            Thread.sleep(delay);
        }
    }

}
