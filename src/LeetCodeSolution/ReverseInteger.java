package LeetCodeSolution;

public class ReverseInteger {
	
	public int reverse(int x){
		int positive = 1;
		if(x<0){
			positive = -positive;
			x = -x;
		}
		long result = 0;
		while(x!=0){
			result = result*10 + x%10;
			x = (x - x%10) / 10;
		}
		if(result>Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		}
		return positive * (int)result;
	}

	public static void main(String[] args) {
		ReverseInteger caller = new ReverseInteger();
		int input = 12345;
		int result = caller.reverse(input);
		System.out.println(result);
	}

}
