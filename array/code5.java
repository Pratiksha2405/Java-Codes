//Find Largest element in an array
import java.util.*;
class LargestElementAndSmallest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the arrya :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements in the array");
		for(int i=0;i<size ;i++){
			 arr[i] = sc.nextInt();
		}
	        int largeelement = arr[0];
		int smallest = arr[0];
		for(int i=0;i<size;i++){
			if(arr[i]>largeelement){
				largeelement = arr[i];
			}
			if(arr[i]<smallest){
				smallest = arr[i];
			}
		}
		System.out.println("largest element in the array is :"+largeelement);
 System.out.println("largest element in the array is :"+smallest);

	}
}
