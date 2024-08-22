package com.xworkz.training.engineering;

public class PlantRunner 
{

	public static void main(String[] args) 
	{
		Plant plant = new Plant("sarpagandha", "Medicine", 2, "asia", "green");
		Plant plant1 = new Plant("mahagani", "furniture", 100, "asia", "green");
		Plant plant2 = new Plant("bamboo", "multipurpuse", 110, "asia", "green");

		
		Plant[] ref=new Plant[3];
		ref[0]=plant;
		ref[1]=plant1;
		ref[2]=plant2;
		
		for(Plant gidaMara:ref)
		{
		
			gidaMara.gida();
		}
		}
		
	}


