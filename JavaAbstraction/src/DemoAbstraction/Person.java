package DemoAbstraction;

public abstract class Person {

	int id;
	String name;
	
	void Speak () {
		System.out.println("Hello");
		
	}
	
	abstract void walk ();
	

}
