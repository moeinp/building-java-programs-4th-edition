package section_examples.employee;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import exercises.Marketer;

public class EmployeeMain {
	public static void main(String[] args) {
		// employee
		System.out.print("Employee: ");
		Employee emp = new Employee();
		System.out.print(emp.getHours() + ", ");
		System.out.printf("$%.2f, ", emp.getSalary());
		System.out.print(emp.getVacationDays() + ", ");
		System.out.println(emp.getVacationForm());
		System.out.println();

		System.out.print("Secretary: ");
		Secretary sec = new Secretary();
		System.out.print(sec.getHours() + ", ");
		System.out.printf("$%.2f, ", sec.getSalary());
		System.out.print(sec.getVacationDays() + ", ");
		System.out.println(sec.getVacationForm());
		sec.takeDictation("copy that");
		System.out.println();

		System.out.print("LegalSecretary: ");
		LegalSecretary lglSec = new LegalSecretary();
		System.out.print(lglSec.getHours() + ", ");
		System.out.printf("$%.2f, ", lglSec.getSalary());
		System.out.print(lglSec.getVacationDays() + ", ");
		System.out.println(lglSec.getVacationForm());
		lglSec.takeDictation("file all day");
		lglSec.fileLegalBriefs();
		System.out.println();
		

		System.out.print("Lawyer: ");
		Lawyer lwyr = new Lawyer();
		System.out.print(lwyr.getHours() + ", ");
		System.out.printf("$%.2f, ", lwyr.getSalary());
		System.out.print(lwyr.getVacationDays() + ", ");
		System.out.println(lwyr.getVacationForm());
		lwyr.sue();
		System.out.println();

		System.out.print("Marketer: ");
		Marketer mrktr = new Marketer();
		System.out.print(mrktr.getHours() + ", ");
		System.out.printf("$%.2f, ", mrktr.getSalary());
		System.out.print(mrktr.getVacationDays() + ", ");
		System.out.println(mrktr.getVacationForm());
		mrktr.advertise();
		System.out.println();

	}
}
