package Practice;
import java.util.Arrays;
import java.util.Scanner;

public class Practice
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; ++i) arr[i] = input.nextInt();
		Arrays.sort(arr);
		
		int ans = 0;
		for(int k = 0; k < n; ++k)
		{
			int i = 0, j = k - 1;
			while(i < j)
			{
				if(arr[i] + arr[j] < arr[k]) ++i;
				else if(arr[i] + arr[j] > arr[k]) --j;
				else { ++ans; break; }
			}
		}
		
		System.out.println(ans);
		
		input.close();
	}
}
