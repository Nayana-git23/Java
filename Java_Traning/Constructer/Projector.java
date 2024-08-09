class Projector
{
  String company;
  String type;
  String color;
  double weight=2;
  
  
  
  public Projector(String company)
  {
	  this.company=company;
  }
  public void setColor(String color)
  {
	  this.color=color;
  }
  public void display()
  {
	  System.out.println(this.company);
		System.out.println(this.type);
		System.out.println(this.color);
		System.out.println(this.weight);
  }
}