class LongestWordFinder{
	public static String findLongestWord(String sentence){
		String[] words = sentence.split(" ");
		String longest = " ";
		for(String word : words){
			if(word.length() > longest.length()){
				longest = word;
			}
		}
		return longest;
	}
	public static void main(String[] args){
		String sentence1 ="I am Pratiksha";
		String sentence2 ="you are the prettiest girl in the world";
		System.out.println("Longest Word : " + findLongestWord(sentence1));
		System.out.println("Longest word :" + findLongestWord(sentence2));
	}
}
