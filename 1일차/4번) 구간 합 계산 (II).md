![4](/img/4.png)
## main.java 소스코드
```java
package pack;
import java.util.Scanner;
public class main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
    
		int n = input.nextInt(), t = input.nextInt();
		int psum[][] = new int[n][n];
    
		psum[0][0] = input.nextInt();
		for(int j = 1; j < n; ++j) psum[0][j] = psum[0][j - 1] + input.nextInt();
		for(int i = 1; i < n; ++i)
		{
			psum[i][0] = psum[i - 1][0] + input.nextInt();
			for(int j = 1; j < n; ++j)
			{
				psum[i][j] = psum[i - 1][j] + psum[i][j - 1] - psum[i - 1][j - 1] + input.nextInt();
			}
		}

		for(int i = 0; i < t; ++i)
		{
			int x1 = input.nextInt(), y1 = input.nextInt(), x2 = input.nextInt(), y2 = input.nextInt();
			if(x1 - 2 < 0 && y1 - 2 < 0) System.out.println(psum[x2 - 1][y2 - 1]);
			else if(x1 - 2 < 0) System.out.println(psum[x2 - 1][y2 - 1] - psum[x2 - 1][y1 - 2]);
			else if(y1 - 2 < 0) System.out.println(psum[x2 - 1][y2 - 1] - psum[x1 - 2][y2 - 1]);
			else System.out.println(psum[x2 - 1][y2 - 1] - psum[x2 - 1][y1 - 2] - psum[x1 - 2][y2 - 1] + psum[x1 - 2][y1 - 2]);
		}
		input.close();
	}
}
```
