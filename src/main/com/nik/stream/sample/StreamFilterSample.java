package com.nik.stream.sample;

import com.nik.stream.sample.model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFilterSample {


    public static void main(String[] args) {

        StreamFilterSample streamFilterSample = new StreamFilterSample();

        streamFilterSample.getSumOfEvenIntegers(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Abe", "123", 2000));
        employeeList.add(new Employee("Climber", "223", 2100));
        employeeList.add(new Employee("Pestro", "321", 2020));

        streamFilterSample.getFirstEmployeeWithSalaryAbove2050(employeeList);

        streamFilterSample.findAllEmployeeWithSalaryAbove2000(employeeList);

    }


    private void getSumOfEvenIntegers(List<Integer> intList) {
        System.out.println(intList.stream().filter(i -> i % 2 == 0).reduce(0, (a, b) -> a + b));
    }

    private void getFirstEmployeeWithSalaryAbove2050(List<Employee> employeeList) {
        System.out.println(employeeList.stream().filter(emp->emp.getSalary()>2050).findFirst());
    }


    private void findAllEmployeeWithSalaryAbove2000(List<Employee> employeeList) {


        List<Employee> empList1=employeeList.stream().filter(emp->emp.getSalary()>2000).collect(Collectors.toList());
        if(empList1.isEmpty())
            System.out.println("No employee found whose salary is > $2000");
        else
            System.out.println("All employee with Salary > $2000 are listed below");
        empList1.stream().forEach(System.out::println);
    }

}
