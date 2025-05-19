class HighestCommonFactor2{
	public static int getHcf(int num1,int num2){
		if(num1==0)
			return num2;
		if(num2==0)
			return num1;
		if(num1 == num2)
			return num1;
		if(num1 >num2)
			return getHcf(num1-num2,num2);
		
			return getHcf(num1,num2-num1);
	}
	public static void main(String[] args){
		int num1 =36;
		int num2 =60;
		int hcf= getHcf(num1,num2);
		System.out.println("The Hcf is :"+hcf);
	}

}
