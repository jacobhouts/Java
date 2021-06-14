package hwconcepts;

public class Person1 {
	static int count=0;
	private String dept;
	private String name;
	private int numberofclasses;
private char carraige = 13;
	public Person1() {
		
		count++;
	}
	
	public String getName() {
		return name;
	}

	
	public String getDept() {
		return dept;
	}

	
	public int getClasses() {
		return numberofclasses;
	}
	public Person1(String name, String dept, int classes) {
	
	this.name = name;
	this.dept = dept;
	this.numberofclasses = classes;
}
public String calculate(double count) {
	String status;
	if(count >= 4 ) {
	status = "Full-Time";	
	}
	else {
		status = "Part-Time";
	}

	return status;
}
}