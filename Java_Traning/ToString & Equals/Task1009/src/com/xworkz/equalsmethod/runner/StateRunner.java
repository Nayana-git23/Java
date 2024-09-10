package com.xworkz.equalsmethod.runner;

import com.xworkz.equalsmethods.State;

public class StateRunner {
	
	public static void main(String args[])
	{
		State state=new State("Karnataka","bengaluru","agriculure",30,30,7);
		State state1=new State("Tamil nadu","chennai","agriculure",30,30,8);
		boolean rajya=state.equals(state1);
		System.out.println(rajya);
		
		
	}

}
