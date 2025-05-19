class LCM1{
	public static int gethcf(int num1,int num2){
		while(num1 != num2){
			if(num1 > num2)
				num1 -= num2;
			else
				num2 -= num1;
		}
		return num1;
	}
	public static void main(String[] args){
		int num1 = 144;
		int num2 =32;
			int hcf = gethcf(num1,num2);
		System.out.println("The hcf :"+hcf);
		int lcm = (num1*num2)/hcf;
		System.out.println("The LCM :"+ lcm);
	}
}
