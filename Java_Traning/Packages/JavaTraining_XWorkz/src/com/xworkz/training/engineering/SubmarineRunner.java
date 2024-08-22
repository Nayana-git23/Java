package com.xworkz.training.engineering;

public class SubmarineRunner 
{

	public static void main(String[] args)
	{
		
				Submarine submarine1 = new Submarine( 120, "Nuclear", "Steel", 800, 30, true, true, "USA", 1954, 16, true, "Black", "Electric Boat Company", true, "Pearl Harbor", "Double-hull", 8, 2000, true, "VLF Communication", "Radar-1", true, "Attack", 20000, true, "Inertial Navigation System", true, 50000, "Propulsion Type A", true, "Torpedoes", true, "VLS", 90);
				Submarine submarine2 = new Submarine( 160, "Nuclear", "Titanium", 1200, 27, true, true, "Russia", 1981, 20, true, "Dark Grey", "Sevmash", true, "Severodvinsk", "Double-hull", 19, 2500, true, "Satellite Communication", "Radar-2", true, "Ballistic Missile", 30000, true, "GPS", true, 70000, "Propulsion Type B", true, "ICBM", true, "SLBM", 120);
				Submarine submarine3 = new Submarine( 31, "Diesel-Electric", "High-Tensile Steel", 350, 20, false, true, "France", 2017, 18, true, "Dark Blue", "DCNS", true, "Mumbai", "Single-hull", 6, 1250, true, "HF Communication", "Radar-3", true, "Attack", 18000, true, "INS", true, 4500, "Propulsion Type C", true, "Torpedoes", true, "VLS", 50);

				Submarine[] fleet = new Submarine[3];
				fleet[0] = submarine1;
				fleet[1] = submarine2;
				fleet[2] = submarine3;

				for (Submarine antaragami : fleet) 
				{
					antaragami.displayDetails();
					System.out.println("----------------------");
				}
			}
		
}
		

	


