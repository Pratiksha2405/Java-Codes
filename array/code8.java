//Calculate the sum of elements in an array
import java.util.*;
class AddElements{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		int sum =0;
		for(int i=0;i<size;i++){
			sum += arr[i];

		}
		System.out.println(sum);
	}
}
