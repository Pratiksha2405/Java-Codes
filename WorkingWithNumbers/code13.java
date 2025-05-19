import java.util.*;
class ReplaceAll0with1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =sc.nextInt();
		String str = Integer.toString(num);
		int len = str.length();
		String str1 ="";
		for(int i=0;i<len;i++){
			if(str.charAt(i) == '0')
				str1= str1 +'1';
			else
				str1 =str1+str.charAt(i);
		}
		System.out.println("converted number is:"+str1);
	}
}
