class ReverseString{
	public static void main(String[] args){
		String str = new String("pratiksha");
		System.out.println(str);
		String newStr = "";
		for(int i=str.length()-1;i>=0;i--){
			newStr = newStr + str.charAt(i);
		}
		System.out.println(newStr);
	}
}

