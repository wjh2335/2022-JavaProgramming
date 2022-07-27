package pack;
import java.util.Scanner;

public class main
{
	public static int[][] map;
	public static int[] visited;
	public static int n;
	
	public static void dfs(int i)
	{
		visited[i] = 1;
		for(int j = i + 1; j <= n; ++j)
		{
			if(map[i][j] == 1 && visited[j] == 0) dfs(j);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		int m = input.nextInt();
		map = new int[n + 1][n + 1];
		visited = new int[n + 1];
		
		for(int i = 0; i < m; ++i)
		{
			int a = input.nextInt(), b = input.nextInt();
			map[a][b] = map[b][a] = 1;
		}
		
		int ans = 0;
		for(int i = 1; i <= n; ++i)
		{
			if(visited[i] == 0)
			{
				dfs(i);
				++ans;
			}
		}
		
		System.out.println(ans);
		input.close();
	}
}
