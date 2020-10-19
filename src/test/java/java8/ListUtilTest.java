package java8;

import lombok.SneakyThrows;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ListUtilTest {

    @Test
    public void countDuplicate() {
        List<String> strings = List.of("java", "JAVA", "JaVa", "Scala");
        int amount = ListUtil.countDuplicate("java", strings, (t1,t2)->t1.equalsIgnoreCase(t2));
        Assert.assertEquals(3,amount);
    }

    @Test
    public void forEachWithDelay() {
        List<Integer> integers = List.of(1, 2, 3);
        ListUtil.forEachWithDelay(integers,500,t-> System.out.println(t));
    }
}