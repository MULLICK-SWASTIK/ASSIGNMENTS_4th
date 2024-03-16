package Ques_8;

class Bicycle implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("The bicycle is accelerating");
	}
	
	public void accelerate(int duration) {
		System.out.println("Bicycle is accelerating for a duration of "+duration+" seconds.");
	}

	@Override
	public void brake() {
		System.out.println("The bicycle's brakes are applied.");
	}
	
	public void brake(int duration) {
		System.out.println("Bicycle is braking for a duration of "+duration+" seconds.");
	}

}
