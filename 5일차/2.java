package pack;
import java.util.Scanner;

public class main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
						
		int n = input.nextInt(), arr[] = new int[n], max = 0;
		
		int[][] que = new int[10][1000];
		int[] head = new int[10], tail = new int[10];
		
		for(int i = 0; i < n; ++i)
		{
			arr[i] = input.nextInt();
			if(max < arr[i]) max = arr[i];
		}

		int maxDigit = 0;
		while(max > 0)
		{
			++maxDigit;
			max /= 10;
		}

		int t1 = 10, t2 = 1;
		for(int k = 0; k < maxDigit; ++k)
		{
			for(int i = 0; i < n; ++i) que[arr[i] % t1 / t2][tail[arr[i] % t1 / t2]++] = arr[i];
			int j = 0;
			for(int i = 0; i < 10; ++i)
			{
				while(head[i] < tail[i]) arr[j++] = que[i][head[i]++];
			}
			t1 *= 10; t2 *= 10;
		}
		
		for(int i = 0; i < n; ++i) System.out.println(arr[i]);
		input.close();
	}
}
