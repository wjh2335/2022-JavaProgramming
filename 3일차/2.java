package pack;
import java.util.Scanner;
import java.util.Stack;

public class main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		
		int n = input.nextInt(), a[] = new int[n], ans[] = new int[n];
		for(int i = 0; i < n; ++i) a[i] = input.nextInt();
		
		stack.push(0);
		for(int i = 1; i < n; ++i)
		{
			while(a[stack.peek()] < a[i])
			{
				ans[stack.pop()] = a[i];
				if(stack.empty()) break;
			}
			stack.push(i);
		}
		while(!stack.empty()) ans[stack.pop()] = -1;
		for(int i = 0; i < n; ++i) System.out.print(ans[i] + " ");
		input.close();
	}
}
