package java8.interview;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GroupByQues {

    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee(1, "emp1", 25), new Employee(2, "emp2", 34)
                , new Employee(3, "emp3", 24), new Employee(3, "emp3", 24),
                new Employee(5, "emp5", 25)
        );

//        Map<Integer, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::age));
//        Map<Integer, Set<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::age,Collectors.toSet()));
        Map<Integer, Set<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::age, TreeMap::new, Collectors.toSet()));
        System.out.println(collect);

    }

}

record Employee(int id, String name, int age) {
}
