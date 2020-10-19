package stream;

import java.util.List;

public class EmployeeUtil {
    public static int sumOfSalary(List<Employee> employees){
        return employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();
    }
}
