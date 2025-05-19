class DigitOccureInInteger{
	public static void main(String[] args){
		int n = 898989;
		int d= 9;
		int count =0;
		while(n >0){
			int rem = n%10;
			if(rem == d)
				count++;
			n/=10;
		}
		System.out.println(count);
	}
}
