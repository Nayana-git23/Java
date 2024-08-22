package com.xworkz.custum.dataStore;

import com.xworkz.custum.data.SideDishData;
import com.xworkz.custum.dataRunner.SideDishStore;

public class SideDishRunnner {

	public static void main(String[] args) {
		SideDishStore sideDishStore = new SideDishStore();
		SideDishData sideDishData = new SideDishData("Pickle", 200, "Vegetarian");
		SideDishData sideDishData1 = new SideDishData("vegetable palya", 250, "Vegetarian");
		SideDishData sideDishData2 = new SideDishData("Pannner burji", 200, "Dairy");
		SideDishData sideDishData3 = new SideDishData("Kebab", 200, "Non Vegetarian");
		SideDishData sideDishData4 = new SideDishData("Omlete", 200, "Egg");

		sideDishStore.dishStore(sideDishData);
		sideDishStore.dishStore(sideDishData1);
		sideDishStore.dishStore(sideDishData2);
		sideDishStore.dishStore(sideDishData3);
		sideDishStore.dishStore(sideDishData4);

		sideDishStore.display();

	}

}
