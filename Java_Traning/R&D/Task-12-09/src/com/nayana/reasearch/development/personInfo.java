package com.nayana.reasearch.development;

public class personInfo {
	
	String name;
	String email;
	int age;
	long mobileNo;
	
	
	public personInfo(String name,String email,int age,long mobileNo)
	{
		this.name=name;
		this.email=email;
		this.age=age;
		this.mobileNo=mobileNo;
	}
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.email);
		System.out.println(this.age);
		System.out.println(this.mobileNo);
	}

}
