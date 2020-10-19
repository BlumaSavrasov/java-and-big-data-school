package stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EmployeeUtilTest {

    @Test
    public void sum() {
        List<Employee> employees = List.of(new Employee(10000, "Dan"), new Employee(12000, "Shir"));
        Assert.assertEquals(22000,EmployeeUtil.sumOfSalary(employees));
    }
}