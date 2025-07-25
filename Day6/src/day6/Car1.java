package day6;

public class Car1 implements Engine,Battery{
    public void start() {
   	 System.out.println("checking car system");
   	 Engine.super.start();
   	 Battery.super.start();
   	 System.out.println("car is ready...");
    }
	@Override
	public void stop() {
		System.out.println("car stopped safely.");
	}
	public static void main(String[] args) {
		Car1 c=new Car1();
		c.start();
		c.stop();
		
		Engine.engineInfo();
		Battery.batteryInfo();
	}
      
}
