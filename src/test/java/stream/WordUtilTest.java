package stream;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;

import static org.junit.Assert.*;

public class WordUtilTest {
    private File file = new File("lines.txt");
    @Test
    public void wordCounter() {
        int amount = WordUtil.wordCounter(file);
        Assert.assertEquals(6, amount);
    }

    @Test
    public void averageLength() {
        double average=WordUtil.averageLength(file);
        Assert.assertEquals(4,average,0.001);
    }
}