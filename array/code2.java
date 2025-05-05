// finding the largest element of the array
import java.util.*;
class LargestElement1{
	public static int getmax(int arr[],int size){
		if(size==1)
			return arr[0];
		return Math.max(arr[size-1],getmax(arr,size-1));
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elemnets in  the array");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
	int max=getmax(arr,size);
	System.out.println(max);
		
	}
}
