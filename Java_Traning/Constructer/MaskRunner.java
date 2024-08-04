class MaskRunner
{
public static void main(String args[])
{
	Mask mask=new Mask();
	System.out.println("---------------------------------------------------------------");
	Mask mask1=new Mask(234.56);
	System.out.println("---------------------------------------------------------------");
	Mask mask2=new Mask(345);
	System.out.println("---------------------------------------------------------------");
	Mask mask3=new Mask("nylon");
	System.out.println("---------------------------------------------------------------");
	Mask mask4=new Mask(234.4,230,"nylon");
	System.out.println("---------------------------------------------------------------");
	Mask mask5=new Mask(234.4,230);
}
}
	
	
	