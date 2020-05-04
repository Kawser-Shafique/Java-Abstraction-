package DemoAbstraction;

public class DemoInterface implements Employees,Adminstrators{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void workhours() {
	System.out.println("Total Work Hours:");
		
	}

	@Override
	public void vacationHours() {
		System.out.println("Total Vacation Hours:");
		
	}

	@Override
	public void TeamBuilding() {
		System.out.println("");
		
	}

}
