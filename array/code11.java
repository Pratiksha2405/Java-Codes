import java.util.*;
class Reverse1{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size in the array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements in the array:");
		for(int i=0;i<size;i++){
			arr[i]= sc.nextInt();
		}
		int i=0;
		int j= arr.length-1;
		while(i<j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for(int k=0;k<size;k++){
			System.out.println(arr[k]+ "");
		}
		
	}
}
