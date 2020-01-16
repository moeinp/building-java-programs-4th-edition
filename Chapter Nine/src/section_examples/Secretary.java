package section_examples;

public class Secretary extends Employee {
//	added behavior
	public void takeDictation(String text) {
		System.out.println("Dictating text: " + text);
	}
}
