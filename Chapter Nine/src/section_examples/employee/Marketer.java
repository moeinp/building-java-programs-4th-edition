package section_examples.employee;

public class Marketer extends Employee {
//	Override method

	public double getSalary() {
		return super.getSalary() + 10000.00;
	}

//	added behavior
	public void advertise() {
		System.out.println("I'll make you rich");
	}
}
