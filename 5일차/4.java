package pack;
import java.util.Scanner;

public class main
{
	public static int[][] map;
	public static int[] visited;
	public static int n;
	
	public static void dfs(int i)
	{
		System.out.print(i + " ");
		visited[i] = 1;
		
		for(int j = 1; j <= n; ++j)
		{
			if(map[i][j] == 1 && visited[j] == 0) dfs(j);
		}
	}
	
	public static void bfs(int i)
	{
		int[] que = new int[n + 1];
		int head = 0, tail = 0;
		
		visited[i] = 1;
		que[tail++] = i;
		
		while(head < tail)
		{
			int now = que[head++];
			System.out.print(now + " ");
			
			for(int j = 1; j <= n; ++j)
			{
				if(map[now][j] == 1 && visited[j] == 0)
				{
					que[tail++] = j;
					visited[j] = 1;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		int m = input.nextInt();
		int v = input.nextInt();
		map = new int[n + 1][n + 1];
		visited = new int[n + 1];
		
		for(int i = 0; i < m; ++i)
		{
			int a = input.nextInt(), b = input.nextInt();
			map[a][b] = map[b][a] = 1;
		}
		
		dfs(v);
		
		System.out.println();
		for(int i = 1; i <= n; ++i) visited[i] = 0;
		
		bfs(v);
		
		input.close();
	}
}
