package design_patterns.home_work;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exercise {
    private  double a;
    private double b;
    private double answer;
    private Operation operand;
    @Builder
    public Exercise(int a,int b,Operation operand){
        this.a=a;
        this.b=b;
        this.operand=operand;
        this.answer=operand.getOperator().applyAsDouble(a,b);
    }
    @Override
    public String toString(){
        return String.format(a+operand.symbol+b+"="+answer);
    }
}
