package com.xworkz.runner;

import com.xworkz.task.River;

public class RiverRunnner 
{
	public static void main(String args[])
	{
	River river=new River();
	river.riverNames("Sharavathi");
	river.riverNames("Kaveri");
	river.riverNames("Krishna");
	river.riverNames("Sathlej");
	river.riverNames("Ganga");
	river.riverNames("Kumadvathi");
	river.riverNames("Thunga");
	river.display();

}
}
