package my_spring;

import com.sun.jdi.LocalVariable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface InjectRandomInt {
 public int min() default 0;
 public int max() default Integer.MAX_VALUE;
}
