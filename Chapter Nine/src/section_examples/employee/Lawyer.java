package section_examples.employee;

public class Lawyer extends Employee {
//	Override method
	public int getVacationDays() {
		return super.getVacationDays() + 5;
	}

//	Override method
	public String getVacationForm() {
		return "Pink";
	}

//	added behavior
	public void sue() {
		System.out.println("I'll see you in court!");
	}
}
