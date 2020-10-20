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

    @Test
    public void sortedNames() {
        List<Employee> employees = List.of(new Employee(10000, "Dan"), new Employee(12000, "Shir"),new Employee(10000, "Benii"));
        List<String> accpectedList=List.of("Dan" ,"Shir","Benii");
        List<String> sortedNames = EmployeeUtil.sortedNames(employees);

                Assert.assertEquals(accpectedList.get(0), sortedNames.get(0));
                Assert.assertEquals(accpectedList.get(1), sortedNames.get(1));
                Assert.assertEquals(accpectedList.get(2), sortedNames.get(2));



    }

        }