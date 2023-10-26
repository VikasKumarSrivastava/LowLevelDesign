package practicelowlevel;

public class Employee {
	String name;
	int empID;
	
	//constructor 1
	Employee(){
		this(100);
		System.out.println("From constructor no 1 from Employee "+empID +" "+name);
	}
	
	//constructor 2
	Employee(int empID){
		this(empID,"Vikas");
		System.out.println("From constructor no 2 "+empID +" "+name);		
	}
	
	//constructor 3
	public Employee(int empID, String name){
		this.empID = empID;
		this.name = name;
		System.out.println("From constructor no 3 "+empID +" "+name);		
	}
	//copy constructor 4
	Employee(Employee e){
		System.out.println("From copy constructor no 4 "+empID +" "+name);
		name  = e.name;
		empID = e.empID;
	}
	@Override public String toString()
	    {
	 
	        return "(" + name + " + " + empID + ")";
	    }
}
