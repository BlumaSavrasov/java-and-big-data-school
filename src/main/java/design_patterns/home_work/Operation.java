package design_patterns.home_work;

import lombok.AllArgsConstructor;
import lombok.Getter;


import java.util.function.DoubleBinaryOperator;
@Getter
@AllArgsConstructor
public enum Operation {
    PLUS("+",Double::sum),
    MINUS("-",(a,b)->a-b),
    MULTIPLY("*",(a,b)->a*b);
    String symbol;
    private DoubleBinaryOperator operator;
}
