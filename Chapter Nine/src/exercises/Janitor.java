package exercises;

import section_examples.employee.Employee;

//Overridden method
public class Janitor extends Employee {
	public int getHours() {
		return super.getHours() * 2;
	}

//	Overridden method
	public double getSalary() {
		return super.getSalary() - 10;
	}

//	Overridden method
	public int getVacationDays() {
		return super.getVacationDays() / 2;
	}

//	Added behavior
	public void clean() {
		System.out.println("Workin' for the man.");

	}

}
