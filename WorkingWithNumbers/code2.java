class HighestCommonFactor1{
	public static void main(String[] args){
		int num1 =36;
		int num2 =60;
		int hcf;
		while(num1 != num2){
			if(num1>num2){
				num1 -= num2;

			}else
				num2 -=num1;
		}
		System.out.println("The Hcf:"+ num1);
	}
}

