package demopackage;

class Bicycle {
	
	public int gear;
	public int speed;
	
	public Bicycle(int gear,int speed){
		this.gear=gear;
		this.speed =speed;
	}
	
	public void applyBrake(int decrement) {
		speed =- decrement;
	}
	public void applyAcceleration(int increment) {
		speed =+ increment;
	}
	
	public String toString() {
		return ("No of gears are " + gear + "\n"+ "speed of bicycle is " + speed);
	}
}

	class MountainBike extends Bicycle{
		public int seatHeight;
		
		MountainBike(int gear,int speed, int seatHeight){
			super(gear,speed);
			this.seatHeight =seatHeight;
		}
		
		public void seatHeight(int newValue) {
			seatHeight = newValue;
		}
		public String toString() {
			return(super.toString() + "\nseat height is "+ seatHeight);
		}
	}
