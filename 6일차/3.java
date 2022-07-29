package pack;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; ++i)
		{
			arr[i][0] = input.nextInt();
			arr[i][1] = input.nextInt();
		}
		Arrays.sort(arr, new Comparator<int[]>()
		{
			public int compare(int[] o1, int[] o2)
			{
				if(o1[1] == o2[1]) return o1[0] - o2[0];
				else return o1[1] - o2[1];
			}
		});
		
		int ans = 1, now = arr[0][1];
		for(int i = 1; i < n; ++i)
		{
			if(arr[i][0] >= now)
			{
				++ans;
				now = arr[i][1];
			}
		}
		System.out.print(ans);
		input.close();
	}
}
