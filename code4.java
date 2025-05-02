class ReverseString4444{
	public static void main(String[] args){
		String str = new String("pratiksha");
		System.out.println(str);
		char newStr[] = str.toCharArray();
		for(int i=str.length()-1;i>=0;i--){
			 System.out.print(newStr[i]);
		}
		
	}
}

