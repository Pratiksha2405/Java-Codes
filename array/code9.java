import java.util.*;
class AddArrayElements{
	public static int getSum(int arr[],int size){
		if(size == 1)
			return arr[0];
		int sum =0;
		for(int i=0;i<size;i++){
			sum = sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements in the array:");
			for(int i=0;i<size;i++){
				arr[i] = sc.nextInt();
			}
		int addsum = getSum(arr,size);
		System.out.println(addsum);
	}
}
