package LeetCodeSolution;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
	//1.如果出现过并且出现的位置大于等于start， 就把start放到出现位置的后一位，end后移以为
	//2.如果没出现过，end后移一位

	public int lengthOfLongestSubstring(String s) {
		if(s == null || s.length() == 0){
			return 0;
		}
		
		int start = 0;
		int end = 0;
		int max = 1;
		Map<Character, Integer> dict = new HashMap<Character, Integer>();
		dict.put(s.charAt(0), 0);
		for(int i = 1; i<s.length(); i++){
			if(dict.containsKey(s.charAt(i)) && dict.get(s.charAt(i)) >= start ) {
				start = dict.get(s.charAt(i))+1;
				end ++;
			}else{
				end++;
			}
			dict.put(s.charAt(i), i);
			max = Math.max(max, end-start+1);
		}
		return max;
	}

	public static void main(String[] args) {
		LongestSubstringWithoutRepeatingCharacters caller =  new LongestSubstringWithoutRepeatingCharacters();
		String input = "wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco";
		int result = caller.lengthOfLongestSubstring(input);
		System.out.println(result);
	}

}
