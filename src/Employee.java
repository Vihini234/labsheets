/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Employee {
    private String name;
    private int age;
    private double salary;
    
    
    
    public Employee (){
    this.name ="Default name";
    this.age =30;
    this.salary =3000.0;
    
}
  public Employee (String name ,int age, double salary){
      this.name = name;
      this.age =age;
      this.salary = salary;
      
  }
  
  public String getName(){
  return name;
  
}
public int getAge(){
return age;

}
 public double getSalary (){
return salary;
}

public void displayDetails(){
System.out.printf("%-10s %3d %10.2f%n", name, age, salary);
    
}

public static void main(String[] args) {
        Employee emp1 = new Employee("Alex  ", 30, 10000.0);
        Employee emp2 = new Employee("John  ", 32, 25000.0);
        Employee emp3 = new Employee("James  ", 45, 40000.0);
        Employee emp4 = new Employee("William  ", 18, 28000.0);
        Employee emp5 = new Employee("David ", 21, 32000.0);

        double totalSalary = emp1.getSalary() + emp2.getSalary() + emp3.getSalary() + emp4.getSalary() + emp5.getSalary();

        System.out.println("Salary for the month of July :");
        System.out.println("=========================================");
        System.out.println("Employee  Name   Age   Salary");
        System.out.println("=========================================");
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
        emp4.displayDetails();
        emp5.displayDetails();
        System.out.println("=========================================");
        System.out.printf("Total %30.2f%n", totalSalary);
    }
}