class LCM{
	public static void main(String[] args){
		int num1 =16;
		int num2= 24;
		int hcf =1;
		for(int i=1;i<=num1 || i<=num2; i++){
			if(num1 %i == 0 && num2 %i==0){
				hcf = i;
			}
		}
		int lcm = (num1 * num2) / hcf;
		System.out.println("The LCM: "+ lcm);
	}
}
