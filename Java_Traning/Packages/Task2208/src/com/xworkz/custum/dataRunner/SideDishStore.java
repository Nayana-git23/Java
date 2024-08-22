package com.xworkz.custum.dataRunner;
import com.xworkz.custum.data.SideDishData;

public class SideDishStore 
{
	
	 SideDishData[]  sideDishData=new  SideDishData[5];
	 int index;
	 
	 public void dishStore(SideDishData dishName)
	 {
		 this.sideDishData[this.index]=dishName;
		 this.index++;
	 }

		public void display()
	 {
		 for(SideDishData ref:sideDishData)
		 {
			 if(ref!=null)
			 {
				 ref.show();
				 System.out.println("----------------------------------------------");
			 }
			 else
			 {
				 System.out.println("Conatins Null values");
			 }
		 }
	 }
	 
	 
	

}
