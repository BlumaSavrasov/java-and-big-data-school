package stream;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum Seniority {
    JUNIOR(0,13999),
    MIDDLE(14000,20999),
    SENIOR(21000,Integer.MAX_VALUE);
    private int min;
    private int max;
    public  static  Seniority getBySalary(int salary){
        return Arrays.stream(values())
                .filter(seniority -> seniority.min <= salary && seniority.max >= salary)
                .findAny()
                .orElseThrow(()->new IllegalStateException(salary + "is not in supported range"));
    }
}
