package pack;

import java.util.Scanner;

public class main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt(), m = input.nextInt(), left = 0, right = 0;
		int[] arr = new int[n];
		for(int i = 0; i < n; ++i)
		{
			arr[i] = input.nextInt();
			if(left < arr[i]) left = arr[i];
			right += arr[i];
		}
		
		while(left <= right)
		{
			int mid = (left + right) / 2, sum = 0, cnt = 0;
			
			for(int i = 0; i < n; ++i)
			{
				sum += arr[i];
				if(sum > mid){ ++cnt; sum = arr[i]; }
			}
			if(sum != 0) ++cnt;
			if(cnt > m) left = mid + 1;
			else right = mid - 1;
		}
		
		System.out.println(left);
		input.close();
	}
}
