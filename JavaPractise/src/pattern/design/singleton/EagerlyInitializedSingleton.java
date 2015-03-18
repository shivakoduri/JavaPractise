package pattern.design.singleton;

/* 
 * In Eager Initialization, instance is created at the time of class loading. 
 * Pros: Easy to Create 
 * Cons: Instance is created even though client application might not be using it.
 * */

public class EagerlyInitializedSingleton {
	
	private static EagerlyInitializedSingleton INSTANCE = new EagerlyInitializedSingleton();
	
	
	private EagerlyInitializedSingleton(){}
	
	public static EagerlyInitializedSingleton getInstance(){
		return INSTANCE;
	}
	
	/*private static EagerlyInitializedSingleton INSTANCE;
	
	private EagerlyInitializedSingleton(){}
	
	public static EagerlyInitializedSingleton getInstance(){
		return INSTANCE = new EagerlyInitializedSingleton();
	}*/

}
