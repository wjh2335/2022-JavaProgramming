package pack1;
import java.util.Arrays;
import java.util.Scanner;
public class main
{
	public static int[] arr;
	public static int find(int left, int right, int num)
	{
		int mid = (left + right) / 2;
		
		if(arr[mid] == num) return 1;
		
		int ret;
		if(mid < num) ret = find(mid + 1, right, num);
		else if(mid > num) ret = find(left, mid - 1, num);
		else ret = 0;
		return ret;
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; ++i) arr[i] = input.nextInt();
		
		Arrays.sort(arr);
		
		int m = input.nextInt();
		for(int i = 0; i < m; ++i)
		{
			int a = input.nextInt();
			System.out.println(find(0, n - 1, a));
		}
		
		input.close();
	}
}
