class NamanaRunner
{
public static  void main(String args[])
{
	Clip clip=new Clip("Black","Clutcher");
	Namana namana=new Namana("namanakogre@gmail.com",clip);
	clip.show();
	namana.showcase();
	
	System.out.println("--------------------------------------");
	
	Clip clip1=new Clip("pink","Hairpen");
	Namana namana1=new Namana("megha@gmail.com",clip);
	clip1.show();
	namana1.showcase();
}
}