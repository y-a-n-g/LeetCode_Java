package LeetCodeSolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LongestValidParentheses {

	public int longestValidParentheses2(String s) {
		Stack<Integer> gap = new Stack<Integer>();
		for (int i=0; i<s.length(); ++i) {
			if (s.charAt(i)=='(') {
				gap.push(i);
			} else {
				if(gap.isEmpty()||s.charAt(gap.peek()) == ')'){
					gap.push(i);
				}else{
					gap.pop();
				}
			}
		}

		if(gap.size()==0){
			return s.length();
		}

		List<Integer> gapIndex = new ArrayList<Integer>();
		gapIndex.add(s.length());
		while(!gap.isEmpty()){
			gapIndex.add(gap.pop());
		}
		gapIndex.add(-1);

		int max = 0;
		for(int i=0;i<gapIndex.size()-1;i++){
			max = Math.max(max, gapIndex.get(i) - gapIndex.get(i+1) - 1);
		}
		return max;
	}

	public static void main(String[] args) {
		LongestValidParentheses caller = new LongestValidParentheses();
		String input = ")()())()()(";
		int result = caller.longestValidParentheses2(input);
		System.out.println(result);
	}

}
