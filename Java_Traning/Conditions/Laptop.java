class Laptop
{
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,
	String os,int harddiskSize,int ramSize)
	{
		System.out.println("Brand :"+brand);
		System.out.println("Serial No :"+serialNo);
		System.out.println("Price :"+price);
		System.out.println("Battery capacity :"+batteryCapacity);
		System.out.println("Screen size :"+screenSize);
		System.out.println("Os: "+os);
		System.out.println("Harddisk Size :"+harddiskSize);
		System.out.println("RAM size :"+ramSize);
		if(serialNo>=0001 && serialNo<=9999999)
		{
			System.out.println(	"Valid seral No");
		}
			else
			{
				System.out.println("Not valid serial no");
			}
			
			
			if(price>=15000 && price<=500000)
		{
			      System.out.println(	"Valid price");
		}
			else
			{
				System.out.println("Not valid price");
			}
			if(batteryCapacity>=50000 && price<=95000)
		{
			      System.out.println(	"Valid battery capacity");
		}
			else
			{
				System.out.println("in valid battery capacity");
			}
			
			if(ramSize>=3 && ramSize<=32)
		{
			      System.out.println(	"Valid RAM size");
		}
			else
			{
				System.out.println("Not valid RAM size");
			}
			if(harddiskSize>=4 && harddiskSize<=512)
		{
			      System.out.println(	"Valid Hard disk size");
		}
			else
			{
				System.out.println("Not valid hard disk size");
			}
			if(screenSize>=8 && screenSize<=30)
		{
			      System.out.println(	"valid screen size");
		}
			else
			{
				System.out.println("Not valid screen size");
			}
	}
}
			
			
		