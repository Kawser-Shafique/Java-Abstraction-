package DemoAbstraction;

public class Student extends Person {

	public static void main(String[] args) {
		
		Student S1 = new Student();
		S1.Speak();
		S1.walk();
	}

	@Override // do not need to write
	void walk() {
		System.out.println("I can walk");
		
		
	}

}
