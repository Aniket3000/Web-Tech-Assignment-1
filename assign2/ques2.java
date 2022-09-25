package assign2;

public class ques2 {
	public static void main(String args[])
	{
		int num1 = 20,num2 = 41,num3 = 52;
		System.out.println("The three numbers are: " + num1 + " , " + num2 + " , " + num3);
		System.out.print("Minimum of these numbers are: ");
		if(num1>num2)
		{
			if(num2>num3)
			{
				System.out.println(num3);
			}
			else
			{
				System.out.println(num2);
			}
		}
		else
		{
			if(num1<num3)
			{
				System.out.println(num1);
			}
			else
			{
				System.out.println(num3);
			}
		}
		
	}

}
