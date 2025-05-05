import java.util.HashMap;
class FirstUniqueChar{
	public static char firstNonRepeatingChar(String input){
		HashMap<Character,Integer> countMap = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

		 for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (countMap.get(ch) == 1) {
                return ch;
            }
        }
	return '_';
	}
	public static void main(String[] args){
		String input1 = "aabbccde";
		String input2 = "aabb";
		System.out.println("first non repeating character in " + input1 + ":"+firstNonRepeatingChar(input1));
		System.out.println("first non repeating character in " + input2 + ":"+firstNonRepeatingChar(input2));
	}}
