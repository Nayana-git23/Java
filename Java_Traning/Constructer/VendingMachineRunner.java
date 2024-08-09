class VendingMachineRunner
{
public static void main(String args[])
{
	Chip chip=new Chip("Bingo",10);
	VendingMachine vendingMachine=new VendingMachine("Mcc",chip);
	
	vendingMachine.print();
	chip.type="Potato";
	chip.setFlavour("Onion");
	chip.show();
	
}
}