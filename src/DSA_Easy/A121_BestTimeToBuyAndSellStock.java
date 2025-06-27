package DSA_Easy;

import java.util.HashMap;
import java.util.Map;

public class A121_BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int price : prices) {
			if (price < minPrice) {
				minPrice = price;
			} else { // price next day; price > minPrice
				maxProfit = Math.max(maxProfit, price - minPrice);
			}
		}

		return maxProfit;
	}

	// WRONG
	public int maxProfitTwo(int[] prices) {
		if (prices.length < 2) {
			return 0;
		}
		int maxProfit = 0;

		Map<String, Integer> map = new HashMap<>();
		map.put("max", 0);
		map.put("min", 0);

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] <= prices[map.get("min")]) {
				map.put("min", i); //get price and date to buy stock
			}
			int profit = prices[i] - prices[map.get("min")]; //calculate profit each day
			
			if(profit > maxProfit) {
				maxProfit = profit;	//update max profit 
				map.put("max", i); //update date to sell stock
			}			
		}

		return maxProfit;
	}
}
