import patterns.Singleton;

public class Main {

	public static void main(String[] args) {
		System.out.println("DP App started");
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();
		System.out.println("Is instances are the same: " + (singleton == singleton1));
		System.out.println("Is instances are the same: " + singleton.equals( singleton1));
		System.out.println("singleton hashcode: " + singleton.hashCode() + " singleton1 hashcode: " + singleton1.hashCode());
	}

}
