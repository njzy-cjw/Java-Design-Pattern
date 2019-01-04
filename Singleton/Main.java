public class Main{
	public static void main(String[] args){
		System.out.println("Start.");
		
		Singleton Obj1 = Singleton.getInstance();
		System.out.println("Stop,");
		Singleton Obj2 = Singleton.getInstance();
		if(Obj1 == Obj2)
		{
			System.out.println("obj1 == obj2");
		}
		else
		{
			System.out.println("obj1 != obj2");
		}
	
	}
}
