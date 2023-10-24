
public class Employee {
	//We can achieve encapsulation by making instance variable as private and use public setter 
	//	and getter method to manipulate and access it respectively;
	private int age;
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Vikas");
		e.setAge(29);
		System.out.println("My name is "+e.getName());
		System.out.println("My age is "+e.getAge());
	}

}
