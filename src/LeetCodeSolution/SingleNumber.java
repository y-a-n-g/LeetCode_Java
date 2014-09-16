package LeetCodeSolution;

//Given an array of integers, every element appears twice except for one. Find that single one.

public class SingleNumber {

	public int singleNumber(int[] A) {
		int result = A[0];
		for(int i=1; i<A.length; i++){
			result = result ^ A[i];
		}
		return result;
	}

	public static void main(String[] args) {
		SingleNumber caller = new SingleNumber();
		int[] input = {1,1,2,2,3,3,4,4,5};
		int result = caller.singleNumber(input);
		System.out.println(result);
	}

}
