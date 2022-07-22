package pack;
import java.util.Scanner;
import java.util.Stack;

public class main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		StringBuffer ans = new StringBuffer();
		
		int n = input.nextInt(), cnt = 0;
		boolean flag = true;
		
		for(int i = 0; i < n; ++i)
		{
			int a = input.nextInt();
			
			while(cnt < a)
			{
				stack.push(++cnt);
				ans.append("+\n");
			}
			
			if(stack.pop() != a) flag = false;
			ans.append("-\n");
		}
		
		if(flag) System.out.println(ans);
		else System.out.println("NO");
		
		input.close();
	}
}
