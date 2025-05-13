package DSA_Easy;

import java.util.HashMap;
import java.util.Map;

public class A121_BestTimeToBuyAndSellStock {

	public int maxProfit(int[] prices) {
		if (prices.length == 1) {
			return 0;
		}
		int min = prices[0];
		int max = prices[0];
		Map<String, Integer> map = new HashMap<>();
		map.put("max", 0);
		map.put("min", 0);
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] >= max) {
				max = prices[i];
				map.put("max", i);
			}
			if (prices[i] <= min) {
				min = prices[i];
				map.put("min", i);
				if (map.get("max") < i) {
					max = 0;
					map.put("max", 0);
				}
			}
		}
		if (map.get("max") <= map.get("min")) {
			return 0;
		}
		int price = prices[map.get("max")] - prices[map.get("min")];

		return price;
	}
}
