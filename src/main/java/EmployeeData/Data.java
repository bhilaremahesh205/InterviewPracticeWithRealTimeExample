package EmployeeData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Data {
    public static List<Employee> getEmployee() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"mahesh","IT",50000));
        employees.add(new Employee(2,"manish","IT",30000));
        employees.add(new Employee(3,"guru","IT",50400));
        employees.add(new Employee(4,"jayesh","IT",20000));
        employees.add(new Employee(5,"rohit","IT",10000));

//        List<Employee> emp = employees.stream().collect(Collectors.toList());
//        System.out.println(emp);
        return employees;


        //List<Employee> emp1 = employees.stream().filter(Employee::getDept()).collect(Collectors.toList());

//        List<Employee> emp2 = employees.stream().sorted().filter(Employee::getDept()).collect(Collectors.toList());



    }
}
