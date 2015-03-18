package pattern.design.singleton;

/* 
 * Singleton is one of the Gangs of Four Design patterns. 
 * Comes in the Creational Design Patterns.
 * Singleton pattern ensures that only one Instance of the class exists in JVM.
 * It is used for logging, drivers objects, caching and thread pool.
 * 
 * -- Use Cases --
 * Used in java.lang.Runtime, java.awt.Desktop.
 * Abstract Factory, Builder, Prototype, Facade etc makes use of Singleton.
 * Singleton classes are created for resources such as File System, Database connections etc.
 * We should avoid the instantiation until unless client calls the getInstance method
 * 
 * -- Rules --
 * Private constructor to restrict instantiation of the class from other classes.
 * Private static variable of the same class that is the only instance of the class.
 * Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.
 * */

public interface Singleton {
	
}
