package LeetCodeSolution;

import java.util.Stack;

public class LargestRectangleInHistogram {

	public int largestRectangleArea(int[] height) {
		int[] h = new int[height.length+1];
		for(int i=0;i<height.length;i++){
			h[i] = height[i];
		}
		h[height.length] = 0;

		Stack<Integer> s = new Stack<Integer>();
		int i=0;
		int max = 0;
		while(i<h.length){
			if(s.isEmpty() || h[s.peek()] <= h[i]){
				s.push(i);
				i++;
			}else{
				int t = s.pop();
				max = Math.max(max, h[t]*(s.isEmpty()?i:i-s.peek()-1));
			}
		}
		return max;
	}

	public static void main(String[] args) {
		LargestRectangleInHistogram caller = new LargestRectangleInHistogram();
		int[] input = {2,1,5,6,2,3};
		int result = caller.largestRectangleArea(input);
		System.out.println(result);

	}

}

