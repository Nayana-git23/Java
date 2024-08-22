package com.xworkz.task;

public class Sweet {
	String[] sweets = new String[7];
	int position;

	public void sweetName(String sweetname) {
		this.sweets[this.position] = sweetname;
		position++;
	}

	public void display() {
		for (String sihi : sweets) {
			System.out.println(sihi);
		}
	}

}
