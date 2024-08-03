package practicelowlevel;


public class Employee {
	String name;
	int empID;
	//constructor 1
	Employee(){
		this(10);
		System.out.println("No args constructor from Employee");
	}
	//constructor 2
	Employee(int empID){
		this(empID,"Vikas");
		System.out.println("From constructor no 2");		
	}
	//constructor 3
	Employee(int empID, String name){
		this.empID = empID;
		this.name = name;
		System.out.println("From constructor no 3");		
	}
}
