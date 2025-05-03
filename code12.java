//Write a Java function that takes a string and prints the frequency of each character (only alphabets) present in it. Ignore case, spaces, and special characters.
import java.util.HashMap;
class CountEachWordFrequency{
	static void CountEachWordFrequency(String input){
		 HashMap<Character, Integer> freqMap = new HashMap<>();
		input = input.toLowerCase();
		for(int i=0;i<input.length();i++){
			char ch =input.charAt(i);
			if(ch >= 'a' && ch <= 'z'){
				freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);

			}
		}
		for(char ch : freqMap.keySet()){
			System.out.println(ch+ " :" +freqMap.get(ch));
		}
	}
	public static void main(String[]args){
		String input = "Programming";
		System.out.println(input);
		CountEachWordFrequency(input);

	}
}
