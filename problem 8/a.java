// package problem 8;

class Employee{
    public String name, departmenet;
    public int id;
    public void calculatePay(){
        
    }
}
class FullTimeEmployee extends Employee{
    public double fixedSalary;
}
class PartTimeEmployee extends Employee{
    public double hourlyRate;
    public int hoursWorked;
}
class ContractEmployee extends Employee{
    public String projectName;
    public double contractAmount;
}
