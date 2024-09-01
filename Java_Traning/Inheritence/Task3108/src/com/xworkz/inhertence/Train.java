package com.xworkz.inhertence;

public class Train {
	
	private int no;
	private String source;
	private String destination;
	
	
	public Train(int no, String source, String destination) {
		super();
		this.no = no;
		this.source = source;
		this.destination = destination;
	}


	public Train(String source, String destination) {
		super();
		this.source = source;
		this.destination = destination;
	}
	
	public void print()
	{
		System.out.println("No  :"+this.no);
		System.out.println("Source :"+this.source);
		System.out.println("Destination :"+this.destination);
		System.out.println("------------------------------------------");
	}
	
	

}
