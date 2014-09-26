package LeetCodeSolution;

public class ContainerWithMostWater {

	public int maxArea(int[] height) {
		int l = 0;
		int r = height.length-1;
		int mostWater = 0;

		while(l < r){
			int curWater = Math.min(height[l], height[r]) * (r - l);
			mostWater = Math.max(curWater, mostWater);

			if(height[l]<height[r]){
				//move left to the first one that bigger then itself
				int i=l+1;
				while(i<r && height[l] - height[i] > 0){
					i++;
				}
				l = i;
			}else{
				int i = r-1;
				while(i>l && height[r]- height[i] > 0){
					i--;
				}
				r=i;
			}
		}
		
		return mostWater;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
