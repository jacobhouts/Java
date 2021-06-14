package hwconcepts;
import java.util.Scanner;


public class Starter {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Employee emp1 = new Employee("Fletcher Houts", 3, 'M', 74, 7042.17);
	Employee emp2 = new Employee("Jeff Buckley",27,'M',270, 72519.89);
			Student stu1 = new Student(0, null, 0, null, 0, null, 0, null, 0 );
			Person1 teacher1 = new Person1("","",0);

			
			Scanner scan = new Scanner(System.in);
			System.out.println("organization: " + stu1.ORGANIZATION);
			System.out.println("_____________________");
			System.out.println("Student/Teacher/Employee: ");
			String personType = scan.next().toLowerCase();
			switch(personType){
			case "student":
				System.out.println("_____________________");			
				System.out.println("stud_id: ");	
				stu1.id = scan.nextInt();
				System.out.println("subject1: ");	
				stu1.subject1 = scan.next();
				scan.nextLine();
				System.out.println("subject1Grade: ");	
				stu1.subject1Grade = scan.nextInt();
				System.out.println("subject2: ");	
				stu1.subject2 = scan.next();
				scan.nextLine();
				System.out.println("subject2Grade: ");	
				stu1.subject2Grade = scan.nextInt();
				System.out.println("subject3: ");
				stu1.subject3 = scan.next();
				scan.nextLine();
				System.out.println("subject3Grade: ");	
				stu1.subject3Grade = scan.nextInt();
				System.out.println("major: ");
				stu1.major = scan.next();
				scan.nextLine();
				System.out.println("totalGrade: ");
				System.out.println("organization" + stu1.ORGANIZATION);
				System.out.println("stud_id: " + stu1.id);
				System.out.println("subject1: " + stu1.subject1);
				System.out.println("subject1Grade: " + stu1.subject1Grade);
				System.out.println("subject2: " + stu1.subject2);
				System.out.println("subject2Grade: " + stu1.subject2Grade);
				System.out.println("subject3: " + stu1.subject3);
				System.out.println("subject3Grade: " + stu1.subject3Grade);
				System.out.println("major: " + stu1.major);
				System.out.println("totalGrade: " + stu1.calculate(stu1.subject1Grade,stu1.subject2Grade,stu1.subject3Grade));
			break;
			case "employee":
				
				System.out.println("_____________________");
				System.out.println("_____________________");
				Scanner scan2 = new Scanner(System.in);
				System.out.println("emp_id: ");
				emp1.emp_id = scan2.nextInt();
				
				System.out.println("emp_name: ");
				emp1.emp_name = scan2.next();
				scan2.nextLine();

			

			System.out.println("emp_salary: ");
			emp1.emp_salary = scan.nextInt();


			System.out.println("Salary Increase: ");	
			emp1.salary_increase = scan.nextDouble();
			System.out.println("Expenses: ");	
			emp1.expenses = scan.nextInt();	
			emp1.display();
	
			
				break;
			case "teacher":
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Teacher Name: ");	
			String name = scan1.next();
			System.out.println("Teacher Dept: ");	
			String dept = scan1.next();
			System.out.println("Number of Classes: ");
		int classes = scan1.nextInt();
Person1 Teacher = new Person1(name,dept,classes);
				System.out.println("name: " + Teacher.getName());
				System.out.println("dept: " + Teacher.getDept());
				System.out.println("numberofclasses: " + Teacher.getClasses());
				System.out.println("numberofclasses: " + Teacher.calculate(Teacher.getClasses()));
break;
			}
				
			}

	}
