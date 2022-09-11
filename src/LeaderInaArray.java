
public class LeaderInaArray {
	public static void leader(int[] arr, int n) {
		//n is the size
		
		//leader is the max element from right
		int leader = arr[n - 1];
		System.out.print(leader +" ");
		
		for(int i = n - 2;i >= 0;i--) {
			if(leader < arr[i]) {
				leader = arr[i];
				System.out.print(leader + " ");
			}
		}
	}
	public static void main(String[] args) {
	//	LeaderInaArray l = new LeaderInaArray();
		int arr[] = new int[] {7, 10, 4, 10, 6, 5, 2};
		int n = arr.length;
		
		leader(arr,n);
	}

}

