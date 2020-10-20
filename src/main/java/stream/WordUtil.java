package stream;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class WordUtil {
    @SneakyThrows
    public static int wordCounter(File file){
        FileReader fileReader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(fileReader);
        long amount=buffer.lines().flatMap(line -> Arrays.stream(line.split(" ").clone()))
                .count();
        buffer.close();
        fileReader.close();
        return (int) amount;
    }
    @SneakyThrows
    public static double averageLength(File file){
        FileReader fileReader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(fileReader);
        int sum = buffer.lines().flatMap(line -> Arrays.stream(line.split(" ").clone()))
                .mapToInt(String::length)
                .sum();
        buffer.close();
        fileReader.close();
        return sum/wordCounter(file);
    }
}
