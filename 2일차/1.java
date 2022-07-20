package pack;
import java.util.Scanner;

public class main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt(), mod = input.nextInt(), ans = 0;
		int psum[] = new int[n], modCnt[] = new int[mod];
		
		psum[0] = input.nextInt();
		for(int i = 1; i < n; ++i) psum[i] = psum[i - 1] + input.nextInt();
		
		for(int i = 0; i < n; ++i)
		{
			++modCnt[psum[i] % mod];
			if(psum[i] % mod == 0) ++ans;
		}
		
		for(int i = 0; i < mod; ++i)
		{
			int factorial = 1;
			for(int j = modCnt[i]; j >= 2; --j) factorial *= j;
			ans += (factorial / 2);
		}
		
		System.out.println(ans);
		input.close();
	}
}
