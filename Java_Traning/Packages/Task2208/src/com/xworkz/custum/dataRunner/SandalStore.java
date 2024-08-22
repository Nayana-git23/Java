package com.xworkz.custum.dataRunner;

import com.xworkz.custum.data.SandalData;

public class SandalStore {

	SandalData[] sandalData = new SandalData[5];
	int index = 0;

	public void store(SandalData sandleInfo) {
		this.sandalData[this.index] = sandleInfo;
		this.index++;
	}

	public void snadleShow() {
		for (SandalData info : sandalData) {
			if (info != null) {
				info.displayData();
				System.out.println("---------------------------------------------");
			} else {
				System.out.println("Has Null Values");
			}
		}
	}
}
