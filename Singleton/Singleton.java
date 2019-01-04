public class Singleton{
	private static Singleton singleton = new Singleton();
	private Singleton()
	{
		System.out.print("only one singleton");
	}
	
	public static Singleton getInstance()
	{
		return singleton;
	}

}
