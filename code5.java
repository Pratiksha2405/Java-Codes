class ReverseString5{
	public static void main(String[] args){
		String str = new String("Pratiksha");
		char newStr[] = str.toCharArray();
		int start =0;
		int end = newStr.length-1;
		while(start<end){
			char temp = newStr[start];
			newStr[start] = newStr[end];
			newStr[end] = temp;
			 start++;
                end--;

		}
		
		System.out.println(newStr);

	}
}
