package pack1;
import java.util.PriorityQueue;
import java.util.Scanner;

public class main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PriorityQueue<Integer> q = new PriorityQueue<>
		(
			(n1, n2) ->
			{
				int v1 = Math.abs(n1);
				int v2 = Math.abs(n2);
				if(v1 == v2) return n1 > n2 ? 1 : -1;
				else return v1 - v2;
			}
		);
		
		int n = input.nextInt();
		for(int i = 0; i < n; ++i)
		{
			int a = input.nextInt();
			if(a == 0)
			{
				if(q.isEmpty()) System.out.println("0");
				else System.out.println(q.poll());
			}
			else q.add(a);
		}
		
		input.close();
	}
}
