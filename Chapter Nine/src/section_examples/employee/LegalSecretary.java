package section_examples.employee;

public class LegalSecretary extends Secretary {
//	Override method
	public double getSalary() {
		return super.getSalary() + 5000.00;
	}

//	added behavior
	public void fileLegalBriefs() {
		System.out.println("I could file all day!");
	}

}
