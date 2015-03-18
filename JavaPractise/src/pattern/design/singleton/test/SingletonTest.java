package pattern.design.singleton.test;

import pattern.design.singleton.EagerlyInitializedSingleton;
import pattern.design.singleton.LazyInitializedSingleton;
import pattern.design.singleton.StaticBlockSingleton;

public class SingletonTest {

	public static void main(String[] args) {
		
		// StaticBlockSingleton
		
		/*StaticBlockSingleton staticBlockSingleton_1, staticBlockSingleton_2;
		
		staticBlockSingleton_1 =  StaticBlockSingleton.getInstance();
		staticBlockSingleton_2 =  StaticBlockSingleton.getInstance();
		
		System.out.println(staticBlockSingleton_1.hashCode()+" - "+staticBlockSingleton_2.hashCode());*/
		
		/*	1. EagerlyInitializedSingleton
			2. EagerlyInitializedSingleton - creating Instance in public method */
		/*
		EagerlyInitializedSingleton eagerlyInitializedSingleton_1, eagerlyInitializedSingleton_2;
		
		eagerlyInitializedSingleton_1 =  EagerlyInitializedSingleton.getInstance();
		eagerlyInitializedSingleton_2 =  EagerlyInitializedSingleton.getInstance();
		
		System.out.println(eagerlyInitializedSingleton_1.hashCode()+" - "
				+eagerlyInitializedSingleton_2.hashCode());*/
		
		// LazyInitializedSingleton
		
		LazyInitializedSingleton lazyInitializedSingleton_1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton lazyInitializedSingleton_2 = LazyInitializedSingleton.getInstance();
		
		System.out.println(lazyInitializedSingleton_1.hashCode()+ " - "+lazyInitializedSingleton_2.hashCode());
	}

}
