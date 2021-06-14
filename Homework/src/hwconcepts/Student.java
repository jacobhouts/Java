package hwconcepts;
import java.util.Scanner;

public class Student extends Person implements PersonInterface{

	
public Student(int id,String sub1,double sub1grade, String sub2,double sub2grade, String sub3,double sub3grade, String major, float grade ) {
	super(id, sub1, sub3grade, sub2, sub3grade, sub3, sub3grade, major, grade);

}
public void display() {

}
public double calculate(double grade1,double grade2,double grade3) {
	return (grade1 + grade2 + grade3) / 3;
}
@Override
public boolean calculate(int num) {
	return false;
}
}
