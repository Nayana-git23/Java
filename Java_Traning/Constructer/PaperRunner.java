class PaperRunner
{
public static void main(String args[])
{
	Paper paper=new Paper('M');
	paper.setisQualityGood(true);
	paper.color="pink";
	paper.display();
	
	System.out.println("-----------------------------------");
	
	Paper paper1=new Paper('s');
	paper1.setisQualityGood(false);
	paper1.color="REd";
	paper1.display();
	
	System.out.println("-----------------------------------");
	
	
	Paper paper2=new Paper('s');
	paper.setisQualityGood(true);
	paper2.color="White";
	paper2.display();
}
}