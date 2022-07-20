![7](/img/7.png)
```java
package pack;
import java.util.Arrays;
import java.util.Scanner;

public class main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt(), m = input.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; ++i) arr[i] = input.nextInt();
		Arrays.sort(arr);
		
		int i = 0, j = n - 1, ans = 0;
		while(i < j)
		{
			if(arr[i] + arr[j] < m) ++i;
			else if(arr[i] + arr[j] > m) --j;
			else
			{
				++ans;
				++i; --j;
			}
		}
		
		System.out.println(ans);
		
		input.close();
	}
}

```
