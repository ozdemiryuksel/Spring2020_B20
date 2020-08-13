package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setEmployeeInfo("ali", 'M', "123456789", "QA", 120000);
        employee2.setEmployeeInfo("veli", 'M', "987654321", "Test", 100000);
        employee3.setEmployeeInfo("deli", 'M', "214365879", "Dev", 130000);
        employee4.setEmployeeInfo("ahmet", 'M', "132435465", "Dev", 110000);
        employee5.setEmployeeInfo("mehmet", 'M', "124356879", "Test", 140000);

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1, employee2, employee3, employee4, employee5));
        double max = Integer.MIN_VALUE;
        String name = "";
        for(Employee each:employeeList){
            double eachSalary = each.salary;
            if(eachSalary>max){
                max= eachSalary;
                name = each.name;
            }
        }
        System.out.println("Max Salary: "+max);
        System.out.println("Name: "+name);

        for(Employee each:employeeList){
            System.out.println(each.name+" : "+each.salary);
        }
    }
}
