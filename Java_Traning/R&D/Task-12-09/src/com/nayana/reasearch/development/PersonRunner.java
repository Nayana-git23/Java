package com.nayana.reasearch.development;

public class PersonRunner {
	
	public static void main(String[] args) {
		
	
	
	personInfo personInfo1=new personInfo("namana","namana@gmail.com",19,8767564323l);
	personInfo personInfo2=new personInfo("nandu","nandu@gmail.com",22,8767564323l);
	personInfo personInfo3=new personInfo("nagu","nagu@gmail.com",32,8767564323l);
	personInfo personInfo4=new personInfo("nirmala","nirmala@gmail.com",20,8767564323l);
	personInfo personInfo5=new personInfo("nethra","netra@gmail.com",25,8767564323l);
	
	personInfo[] ref=new personInfo[5];
	
	
	ref[0]=personInfo1;
	ref[1]=	personInfo2;	
	ref[2]=	personInfo3;	
	ref[3]=personInfo4;
	ref[4]=personInfo5;
	
	for(personInfo store:ref)
	{
		System.out.println(store);
		store.display();
		System.out.println("-------------------------------------------------");
	}
	
}
}
