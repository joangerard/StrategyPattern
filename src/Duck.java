
public abstract class Duck {
	FlyBehavior flyBehavior;
	
	protected void swim(){
		System.out.println("I can swim");
	}
	
	protected void performFly(){
		flyBehavior.fly();
	}
	
	protected void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}
	
	public abstract void display();
}
