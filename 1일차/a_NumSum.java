/* N(1 <= N <= 100)길이의 문자열을 받고 각 자리 수를 더한 값을 출력하는 프로그램 */

package pack;
import java.util.Scanner;
public class a_NumSum
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
