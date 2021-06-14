package hwconcepts;

public class Person {

	String name1;

	int id;
	String subject1;
	double subject1Grade;
	String subject2;
	double subject2Grade;
	String subject3;
	double subject3Grade;
	String major;
	float totalGrade;

	public Person(String name, int id, double salary) {
		name1 = name;
		id = id;
		salary = salary;

	}

	public Person(int id, String sub1, double sub1grade, String sub2, double sub2grade, String sub3, double sub3grade,
			String major, float grade) {
	}
}