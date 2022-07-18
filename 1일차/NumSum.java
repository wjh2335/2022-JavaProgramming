package pack;
import java.util.Scanner;
public class NumSum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt(), sum = 0;
        String str = input.next();
        
        for(int i = 0; i < n; ++i)
            sum += str.charAt(i) - '0';
        
        System.out.println(sum);
        
        s.close();
    }
}

/*
입력 예제 1
1
1
입력 예제 2
5
54321
입력 예제 3
25
7000000000000000000000000
입력 예제 4
11
10987654321
*/
