
public class DecoyDuck extends Duck{

	
	public DecoyDuck(FlyBehavior fly) {
		this.flyBehavior = fly;
	}


	public void display() {
		System.out.println("I am a decoy duck");
	}
}
