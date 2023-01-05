package patterns;

import enums.DesignPatternsTypes;

public class Singleton implements DesignPattern	 {

	private static Singleton instance = null;
	private static Object lock = new Object();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (lock) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	@Override
	public DesignPatternsTypes getType() {
		return DesignPatternsTypes.SINGLETON;
	}

}
