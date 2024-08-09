class SoftwareEngineer
{
String name;
int expirence;
String designation;
double salary;

public SoftwareEngineer()
{
	System.out.println("Running in software engineer");
}

public SoftwareEngineer(String name,int expirence,String designation,double salary)
{
	this.name=name;
	this.expirence=expirence;
	this.designation=designation;
	this.salary=salary;
}
public void display()
{
	System.out.println("Name  :"+this.name);
	System.out.println("Expirence  :"+this.expirence);
	System.out.println("Desigantion :"+this.designation);
	System.out.println("Salary  :"+this.salary);
}
}



	