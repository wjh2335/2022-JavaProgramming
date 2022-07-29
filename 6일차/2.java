package pack;
import java.util.PriorityQueue;
import java.util.Scanner;

public class main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PriorityQueue<Integer> que = new PriorityQueue<>();
		
		int n = input.nextInt(), sum = 0;
		for(int i = 0; i < n; ++i) que.add(input.nextInt());
		
		while(que.size() > 1)
		{
			int a = que.poll() + que.poll();
			sum += a;
			que.add(a);
		}
		
		System.out.print(sum);
		input.close();
	}
}
