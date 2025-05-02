class ReverseSentance{
	static String reverseEachWord(String Sentence){
		String[] words = Sentence.split(" ");
		String result = " ";
		for(int i =0;i<words.length;i++){
			String reverseWord = " ";
			for(int j=words[i].length()-1;j<=0;j--){
				reverseWord += words[i].charAt(j);
				
			}
			result += reverseWord;
			if(i<words.length-1){
				result += " ";
			}
		}
		return result;
	}
	public static void main(String[] args){
		String Sentence1 = " i A am Pratiksha";
		String sentence2 = " i want to be part of mnc company";
		System.out.println("first String:"+reverseEachWord(Sentence1));
		System.out.println("second String:" +reverseEachWord(sentence2));

	}
}
