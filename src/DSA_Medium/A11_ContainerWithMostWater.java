package DSA_Medium;

public class A11_ContainerWithMostWater {

	public static void main(String[] args) {		
		//height = [1,8,6,2,5,4,8,3,7]
	}
	static {
		for(int i = 0; i<= 500; i++) { //maxArea run 500 times -> HotSpot (hot method)
			maxArea(new int[] {0,0}); //warm up and jump straight to native code
		}
	}
	
	//2 POINTERS
	public static int maxArea(int[] height) {
		if(height.length == 2) {
			return Math.min(height[0], height[1]);
		}		
		int i = 0;
		int j = height.length - 1;	
		int tank = 0;
		while(i < j) {
			int tankTemp = Math.min(height[i], height[j]) * (j - i); // calculate tank value length * height
			tank = Math.max(tank, tankTemp); // only return max
			
			if(height[i] < height[j]) { //move smaller value pointer to next step
				i++; 
			}else {
				j--;
			}
		}
		
		return tank;
	}
	
	//get min & length bw 2 lines
	// 2 pointers: start and end 
	// value of i, j and length j - i 
	// move pointer has lower value and compare tank value -> update value of pointer

}
