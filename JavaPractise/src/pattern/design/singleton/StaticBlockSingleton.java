package pattern.design.singleton;

/* 
 * In StaticBlockSingleton, instance is created at the time of class loading. 
 * Pros: Easy to Create 
 * Cons: Instance is created even though client application might not be using it.
 * 		 It doesn't provide exceptional handling.
 * */

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton INSTANCE ;
	
	static{
		try{
			INSTANCE = new StaticBlockSingleton();
		}catch(Exception e){
			throw new RuntimeException("Cannot Create Instance of this object.");
		}
	}
	
	private StaticBlockSingleton(){}
	
	public static StaticBlockSingleton getInstance(){
		return INSTANCE;
	}

}
