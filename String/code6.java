class StringRev{
	String revString(String str){
		if(str == null || str.length() <=1){
			return str;
		}
		return  revString(str.substring(1)) +str.charAt(0);
	}
	public static void main(String[] args){
		String str ="pratiksha";
		StringRev obj = new StringRev();
		String reverse = obj.revString(str);
		System.out.println(reverse);
	}
}
