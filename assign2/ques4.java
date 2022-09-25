package assign2;

public class ques4 {
	public static void main(String args[])
	{
		int new_popln = 80000;
		int old_popln = 80000;
		int year_cnt = 0;
		System.out.println("Old population: " + old_popln);
		while(new_population <= 150000)
		{
			new_population += (new_popln*5)/100;
			year_cnt++;
		}
		System.out.println("Year when the population exceeds 150000: " + year_cnt);
		System.out.println("Population at that time: " + new_popln);
	}
}
