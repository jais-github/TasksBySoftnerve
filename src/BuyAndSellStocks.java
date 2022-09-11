
public class  BuyAndSellStocks{
	public  static int maxProfitt(int[] prices) {
		//here mp is maximum profit 
		int mp = 0;
		int l = 0;
		int r = l + 1;
		
		while(r <= prices.length - 1) {
			if(prices[l] >= prices[r]) {
				l = r;
				r++;
				
			}else if(prices[l] < prices[r]) {
				int profit = prices[r] - prices[l];
				if(profit > mp) {
					mp = profit;
				}
				r++;
			}
		}
		return mp;
	}
	
	public static void main(String[] args) { int[] arr = {7, 1, 5, 3, 6, 4};
	  
	  int maxProfit = maxProfitt(arr);
	  System.out.println("Maximum profit is: "+maxProfit);
}
}

