package com.xworkz.custum.dataStore;

import com.xworkz.custum.data.SandalData;
import com.xworkz.custum.dataRunner.SandalStore;

public class SandalRunner {

	public static void main(String[] args) {
		SandalStore sandlestore = new SandalStore();

		SandalData sandalData = new SandalData("paragon", 'M', 5, "black");
		SandalData sandalData1 = new SandalData("VKC", 'S', 6, "gray");
		SandalData sandalData2 = new SandalData("Bata", 'M', 7, "brown");
		SandalData sandalData3 = new SandalData("Lunar", 'S', 4, "red");
		SandalData sandalData4 = new SandalData("Sparax", 'M', 5, "copper");

		sandlestore.store(sandalData);
		sandlestore.store(sandalData1);
		sandlestore.store(sandalData2);
		sandlestore.store(sandalData3);
		sandlestore.store(sandalData4);

		sandlestore.snadleShow();

	}

}
