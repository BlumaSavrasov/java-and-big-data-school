package stream.lab;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;

import java.util.stream.Collectors;


public class FridayThirteen {
    public static void fridayThirteen(int startingYear,int endingYear){
        LocalDate startingDate = LocalDate.of(startingYear, 1, 13);
        LocalDate endingDate = LocalDate.of(endingYear, 12, 13);
        startingDate.datesUntil(endingDate, Period.ofMonths(1))
                .filter(date -> date.getDayOfWeek() == DayOfWeek.FRIDAY)
                .collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()))
                .entrySet().stream()
                .sorted((o1, o2)-> (int) (o2.getValue()-o1.getValue()))
                .forEach(System.out::println);



    }

    public static void main(String[] args) {
        fridayThirteen(1900,1920);
    }
}
