package day6;

public interface Engine {
void stop();
	
	default void start() {
		System.out.println("Engine started");
	}
	static void engineInfo() {
		System.out.println("This is an Engine static method");
	}
}
interface Battery{
	void stop();
	
	default void start() {
		System.out.println("Battery started");
	}
	static void batteryInfo() {
		System.out.println("This is a Battery static method");
	}
}
