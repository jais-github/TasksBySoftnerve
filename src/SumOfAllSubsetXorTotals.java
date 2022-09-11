
import java.util.ArrayList;
import java.util.List;

public class SumOfAllSubsetXorTotals {
	public static int SumOfAllSubsetXorTotals (int[] nums) {
		return inOnePass(nums,0,0);
	}
	
	public static int inOnePass(int[] nums, int index, int currentXor) {
		if(index == nums.length) {
			return currentXor;
		}
		int withElement = inOnePass(nums,index + 1,currentXor ^ nums[index]);
		int withoutElement = inOnePass(nums,index+ 1, currentXor);
		
		return withElement + withoutElement;
	}
	
	public static int calculateSubsetXorSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> current = new ArrayList<>();
		subsets(nums,0,current,result);
		int total = 0;
		
		for(int i = 0; i < result.size();i++) {
			List<Integer> list = result.get(i);
			int xorSum = list.size()>0 ? list.get(0): 0;
			for(int j = 1; j < list.size();j++) {
				xorSum ^= list.get(j);
				total += xorSum;
			}
		}
			return total;
		
		}
		
		public static void subsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
			result.add(new ArrayList<>(current));
			for(int i=index;i<nums.length;i++) {
			current.add(nums[index]);
			subsets(nums, i+1, current,result);
			current.remove(current.size() - 1);
			}
		}
	
	
	public static void main(String[] args) {
		
		int[] arr = {5, 1, 6};
		
		int size = arr.length;
		System.out.println(SumOfAllSubsetXorTotals(arr));
	}
	}



