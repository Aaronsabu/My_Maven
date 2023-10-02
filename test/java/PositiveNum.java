public class PositiveNum {
	public void print(int a)
	{
		if(a<0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("number is positive");
		}
	}

	public static void main(String[] args) {
		PositiveNum obj = new PositiveNum();
		obj.print(5);

	}

}
