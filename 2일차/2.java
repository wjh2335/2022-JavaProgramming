package pack;
import java.util.Scanner;

public class main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt(), sum, start, end, ans = 0;
		sum = start = end = 1;
		
		while(start <= n)
		{
			if(sum > n) { sum -= start; ++start; }
			else if(sum < n) { ++end; sum += end; }
			else
			{
				++end; sum += end;
				++ans;
			}
		}
		
		System.out.print(ans);
		
		input.close();
	}
}
