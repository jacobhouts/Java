package hwconcepts;
import java.util.Scanner;

public class Employee extends Person{

int emp_id;
double emp_salary;
String emp_name;
double salary_increase;
int expenses;
 Employee(String name, int age, char gender, int id, double salary) {
		super(name,  id , salary);
		this.salary_increase = salary_increase;
		
		

	}

public void display()
{	

System.out.println("Employee Name: " + this.emp_name);

	System.out.println("Employee ID: " + this.emp_id);
System.out.println("Employee Salary: " + this.emp_salary);
System.out.println("New Salary: " + calculate(emp_salary,salary_increase,expenses));
	System.out.println(" ");

}
public double calculate(double salary,double increase,double expenses) {
	return (salary + increase - expenses);
}
}