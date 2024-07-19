class MedicineRunner
{
public static void main(String[] medicine)
{
	if(medicine.length==4)
	{
		String name=medicine[0];
		String manufactureDate=medicine[1];
		String price=medicine[2];
		String quantity=medicine[3];
	
		double convertedPrice=Double.parseDouble(price);
		int convertedQuantity=Integer.parseInt(quantity);
	
	     Medicine.medicineNames(name,manufactureDate,convertedPrice,convertedQuantity);
	}
	else{
		System.out.println("REquired four arguments");
	}
}
}