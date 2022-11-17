package oop;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee.name = "Jeff";
        employee.age = 32;
        employee.jobTitle = "Construction Worker";

        employee2.name = "Sarach";
        employee2.age = 28;
        employee2.jobTitle = "Electrician";

        employee3.name = "Bill";
        employee3.age = 37;
        employee3.jobTitle = "Project Manager";

        bar(employee3);
        bar(employee);
        bar(employee2);

        System.out.println(employee.age);
        System.out.println(employee2.age);
        System.out.println(employee3.age);
    }

    static void  bar(Employee emp) {
        System.out.println(emp.name + " is " + emp.age + " years old and is a " + emp.jobTitle);

        emp.age = 20;
    }

}
