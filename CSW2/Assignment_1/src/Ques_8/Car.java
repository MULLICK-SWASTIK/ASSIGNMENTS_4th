package Ques_8;

class Car implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("The car is accelerating.");
	}
	
	public void accelerate(int duration) {
		System.out.println("Car is accelerating for a duration of "+duration+" seconds.");
	}

	@Override
	public void brake() {
		System.out.println("The brakes for car is applied.");
	}
	
	public void brake(int duration) {
		System.out.println("Car is braking for a duration of "+duration+" seconds.");
	}

}
