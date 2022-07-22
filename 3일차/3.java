package pack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<>();
		
		int n = input.nextInt();
		for(int i = 1; i <= n; ++i) que.add(i);
		
		while(que.size() > 1)
		{
			que.poll();
			que.add(que.poll());
		}
    
		System.out.println(que.poll());
		input.close();
	}
}
