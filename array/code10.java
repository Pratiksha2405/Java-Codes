import java.util.*;
class Reverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size in the array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements in the array:");
		for(int i=0;i<size;i++){
			arr[i]= sc.nextInt();
		}
		for(int  i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
}
