public class StringDisplay extends AbstractDisplay{
	private String ch;
	private int width;
	public StringDisplay(String ch)
	{
		this.ch  = ch;
		this.width = ch.getBytes().length;
	}
	public void open()
	{
		printLine();	
	}
	public void print()
	{
		System.out.print("|"+ch+"|");
	}
	public void close()
	{
		printLine();
	}
	private void printLine()
	{
		System.out.print("+");
		for(int i = 0;i < width;i++)
		{
			System.out.print("-");
		}
		System.out.print("+");
	}
}
