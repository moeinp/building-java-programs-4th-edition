package exercises;

import section_examples.employee.Employee;

public class Marketer extends Employee {
//	Override method

	public double getSalary() {
		return super.getSalary() + 10000.00;
	}

//	added behavior
	public void advertise() {
		System.out.println("Act now, while supplies last!");
	}
}
