package pack;
import java.util.Scanner;

public class main
{
	public static int[] arr, tmp;
	
	public static void mergeSort(int left, int right)
	{
		if(left >= right) return;
		
		int mid = (left + right) / 2;
		int index1 = left, index2 = mid + 1;
		
		mergeSort(left, mid);
		mergeSort(mid + 1, right);
		
		for(int i = left; i <= right; ++i) tmp[i] = arr[i];
		
		int k = left;
		while(index1 <= mid && index2 <= right)
		{
			if(tmp[index1] > tmp[index2]) arr[k++] = tmp[index2++];
			else arr[k++] = tmp[index1++];
		}
		while(index1 <= mid) arr[k++] = tmp[index1++];
		while(index2 <= right) arr[k++] = tmp[index2++];
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		arr = new int[n];
		tmp = new int[n];
		
		for(int i = 0; i < n; ++i) arr[i] = input.nextInt();
		
		mergeSort(0, n - 1);
		
		for(int i = 0; i < n; ++i) System.out.println(arr[i]);
		input.close();
	}
}
