class SumOfNaturalNumbers2{
	public static int getsum(int n){
		if(n == 0)
			return n;
		return n + getsum (n-1);
	}
	public static void main(String[] args){
		int n = 10;
		int sum = getsum(n);
		System.out.println(sum);
	}
}
