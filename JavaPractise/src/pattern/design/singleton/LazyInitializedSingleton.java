package pattern.design.singleton;

/* 
 * In Lazy Initialization, instance is created only when getInstance method is called on its Obejct. 
 * Pros: Works fine incase of single threaded environment 
 * Cons: In case of multithreaded, threads will get the different instances of singleton class.
 * */

public class LazyInitializedSingleton {
	
	private static LazyInitializedSingleton lazyInitializedSingleton;
	
	private LazyInitializedSingleton(){}
	
	public static LazyInitializedSingleton getInstance(){
		
		if (lazyInitializedSingleton == null){
			lazyInitializedSingleton = new LazyInitializedSingleton();
		}
		return lazyInitializedSingleton;
	}
}
