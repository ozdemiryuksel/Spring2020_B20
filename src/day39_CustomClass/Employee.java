package day39_CustomClass;

public class Employee {
    String name;
    char gender;
    String SSN;
    String job;
    double salary;

    public void setEmployeeInfo(String employeeName, char employeeGender, String employeeSSN, String employeeJob, double employeeSalary){
        name = employeeName;
        gender = employeeGender;
        SSN = employeeSSN;
        job = employeeJob;
        salary = employeeSalary;
    }

    public void getEmployeeInfo(){
        System.out.println("Name: "+name+", Gender: "+gender+", Job: "+job+", Salary: "+salary);
        System.out.println("SSN: "+SSN.substring(SSN.length()-4));
    }
}
