class Snake
{
private String name;
private double length;
private String type;

public Snake(String name,double length,String type);
{
this.name=name;
this.length=length;
this.type=type;
}
public void print()
{
	System.out.println("Snake name :"+this.name);
	System.out.println("Sanke length :"+this.length);
	System.out.println("type :"+this.type);
}
}