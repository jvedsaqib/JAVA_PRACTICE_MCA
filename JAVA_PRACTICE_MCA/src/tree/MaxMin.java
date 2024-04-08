package tree;


public class MaxMin {
	
	int max;
	int min;
	
	MaxMin(int max, int min) {
		this.max = max;
		this.min = min;
	}
	
	static MaxMin findMaxMin(int[] arr, int start, int end) {
		int max, min;
		
		if(start == end)
			return new MaxMin(arr[start], arr[start]);
		
		else if((start - end) == 1)
			return new MaxMin(arr[start], arr[end]);
		
		else {
			int mid = (start + end) / 2;
			
			MaxMin leftMaxMin = findMaxMin(arr, start, mid);
			MaxMin rightMaxMin = findMaxMin(arr, mid + 1, end);
			
			max = Math.max(leftMaxMin.max, rightMaxMin.max);
			min = Math.min(leftMaxMin.min, rightMaxMin.min);
		}
		
		return new MaxMin(max, min);
	}
	
	// ======================= MAIN =============================
	
	public static void main(String[] args) {
		int[] maxminArr = {10, 12, 1, 5, 1, 9, 255};
		MaxMin mm = findMaxMin(maxminArr, 0, maxminArr.length - 1);
		
		System.out.println("Maximum number = " + mm.max);
		System.out.println("Minimum number = " + mm.min);
	}
}
