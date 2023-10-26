package practicelowlevel;

public class Main {

	public static void main(String[] args) {
		Employee emp3 = new Employee(103,"BIBEK");
		Employee emp4 = new Employee(emp3);
		Employee emp5 = emp4;
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);
	}
}

