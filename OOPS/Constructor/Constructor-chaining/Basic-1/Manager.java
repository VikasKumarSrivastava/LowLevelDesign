package practicelowlevel;

public class Manager extends Person {
	String name;
	Manager(String name,int empID){
		super(empID);
		this.name = name;
		System.out.println("Manager constructor is called and value is " + empID +" "+ name);
	}

}
