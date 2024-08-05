class Paper
{
	String thickness="0.1nm";
	char size;
	boolean isQualityGood;
	String color;
	
	
	public Paper(char size)
	{
		this.size=size;
	}
	
	
	public void  setisQualityGood(boolean isQualityGood)
	{
		this.isQualityGood=isQualityGood;
	}
	
	public void display()
	{
		System.out.println(this.thickness);
		System.out.println(this.size);
		System.out.println(this.isQualityGood);
		System.out.println(this.color);
  }
}
	
	