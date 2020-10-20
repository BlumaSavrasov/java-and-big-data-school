package stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeUtil {
    public static int sumOfSalary(List<Employee> employees){
        return employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();
    }
    public static List<String> sortedNames(List<Employee> employees){
        return employees.stream().map(Employee::getName)
                .sorted((Comparator.comparingInt(String::length)))
                .collect(Collectors.toList());
    }
    public static Map<Seniority, List<Employee>> groupBySeniority(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(employee -> Seniority.getBySalary(employee.getSalary())));
    }


}
