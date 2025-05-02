class CountVowelsAndConsonant{
	 static void CountVowelsAndConsonant(String input){
		 int vowel =0;
		 int consonat=0;
		 input=input.toLowerCase();
		 for(int i=0;i<input.length();i++){
			 char ch = input.charAt(i);
			 if(ch >= 'a' && ch <='z'){
				 if(ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' || ch == 'u'){
				 vowel++;
			 }else{
				 consonat++;
			 }
			 }
		 }
		 System.out.println(vowel);
		 System.out.println(consonat);
	}
	public static void main(String[] args){
		String input1 ="hi Pratiksha";
		System.out.println("input1"+input1);
		CountVowelsAndConsonant(input1);
		 String input2 ="hi ganesh";
                System.out.println("input2"+input2);
                CountVowelsAndConsonant(input2);
	}
}
