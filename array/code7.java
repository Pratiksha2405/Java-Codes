//Find Second Smallest Element in an Array
import java.util.*;
class SecondLargest{
	public static int getsecSmall(int arr[], int size ){
		int first_small = arr[0];
		for(int i=0; i<size;i++){
			if(arr[i]<first_small){
				first_small = arr[i];
			}
		}
		int sec_small = Integer.MAX_VALUE;
		for(int i=0;i<size;i++){
			if(arr[i] != first_small && arr[i] < sec_small){
				sec_small = arr[i];
			}
		}
		return sec_small;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the arrya");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements in the arry");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		int sec_small = getsecSmall(arr,size);
		System.out.println(sec_small);
	}
}
