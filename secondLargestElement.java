public class secondLargestElement {
	public static int findSecondLargest(int n, int[] arr) {
		int first = Integer.MIN_VALUE;
		int second = -1;
		for(int i=0;i<n;i++){
			if(arr[i] > first){
				second = first;
				first = arr[i];
			}
			else{
				if(arr[i] > second && arr[i] != first)
				second = arr[i];
			}
		}
		
		if(second == Integer.MIN_VALUE)
		return -1;

		return second;
	}
}
