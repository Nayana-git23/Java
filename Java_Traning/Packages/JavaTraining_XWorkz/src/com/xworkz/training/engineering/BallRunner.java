package com.xworkz.training.engineering;

public class BallRunner {

	public static void main(String[] args) 
	{
		Ball ball = new Ball("white ball", "white", "bowling", "crcket", "Jasprith bumrah", "omtex", 50.50, 3, "nayana",
				"12-aug-2024", 2, 20, "15-aug-2024", 12345l, 500, "34rgt45", 23456543l);
		
		Ball ball1 = new Ball("foot ball", "Black white", "playing", "football", "sunil chetri", "omtex", 50.50, 3,
				"amogha", "12-may-2023", 2, 20, "15-aug-2024", 12345l, 500, "34rgt45", 23456543l);
		
		Ball ball2 = new Ball("vollyball", "brown", "throwing", "vollyball", "kiran a r", "jasproo", 60.50, 4, "guru",
				"12-aug-2022", 2, 20, "15-aug-2022", 12345l, 500, "34rgt46", 23456543l);

		Ball[] ref = new Ball[3];
		ref[0] = ball;
		ref[1] = ball1;
		ref[2] = ball2;
		for (Ball chendu : ref) 
		{
			chendu.print();
		}

	}

}
