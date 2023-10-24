package demopackage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(3,100,25);
		System.out.println(mb.toString());

	}

}
// In the above program, when an object of MountainBike class is created, a copy of all methods and fields of the superclass acquires memory in this object. 
// That is why by using the object of the subclass we can also access the members of a superclass
