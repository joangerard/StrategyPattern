
public class Main {
	public static void main(String[] args){
		FlyBehavior fly = new FlyNoWay();
		Duck myduck = new DecoyDuck(fly);
		myduck.display();
		myduck.swim();
		myduck.performFly();
		myduck.setFlyBehavior(new FlyWithWings());
		myduck.performFly();
	}
}
