package com.xworkz.custum.dataStore;

import com.xworkz.custum.data.MarketData;
import com.xworkz.custum.dataRunner.MarketStore;

public class MarketRunner {

	public static void main(String[] args) {
		MarketStore marketStore = new MarketStore();
		MarketData marketData = new MarketData("K R Market", "Bengaluru");
		MarketData marketData1 = new MarketData("Khan Market", "Delhi");
		MarketData marketData2 = new MarketData("Colaba", "Mumbai");
		MarketData marketData3 = new MarketData("Chor bajar", "Mumbai");
		MarketData marketData4 = new MarketData("City Market", "Bengaluru");

		marketStore.store(marketData);
		marketStore.store(marketData1);
		marketStore.store(marketData2);
		marketStore.store(marketData3);
		marketStore.store(marketData4);

		marketStore.show();

	}

}
