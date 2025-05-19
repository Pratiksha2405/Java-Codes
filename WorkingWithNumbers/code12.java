import java.util.*;
class FractionAddition{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerator for first fraction:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the denominator for first fraction:");
		int den1 = sc.nextInt();
		System.out.println("Enter numerator for second fracton :");
		int num2 = sc.nextInt();
		System.out.println("Enter the Denominator of Second Fraction:");
		int den2 = sc.nextInt();
		int den,num,x;
		System.out.println("("+num1+ "/"+den1+ ") + ("+num2+ "/"+den2+")=");
		if(den1 == den2){
			num=num1 + num1;
			den = den1;
		}
		else{
			num = (num1*den2) + (num2* den1);
			den=den1*den2;
		}
		int originalNum = num;
		int originalDen = den;
		int gcd =getGCD(num,den);
		num = num/gcd;
		den=den/gcd;
		System.out.println("(" + num1 + "/" + den1 + ") + (" + num2 + "/" + den2 + ") = (" + num + "/" + den + ")");
	}
    public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
	
	}


