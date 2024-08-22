package com.xworkz.training.engineering;

public class Submarine {

	String name = "INS Kalavari";
	double length = 230;
	double width = 299;
	double height = 200;
	double weight = 230;
	int crewCapacity;
	String propulsionType;
	String material;
	int maxDepth;
	double speed;
	boolean isNuclearPowered;
	boolean hasSonar;
	String countryOfOrigin;
	int yearBuilt;
	int missileCapacity;
	boolean hasTorpedo;
	String color;
	String manufacturer;
	boolean isActive;
	String homePort;
	String hullType;
	int numberOfCompartments;
	int batteryCapacity;
	boolean hasEscapePod;
	String communicationSystem;
	String radarSystem;
	boolean hasStealthTechnology;
	String missionType;
	double fuelCapacity;
	boolean hasPeriscope;
	String navigationSystem;
	boolean hasAirlock;
	int enginePower;
	String propulsionSystem;
	boolean hasAntiSubmarineWeapons;
	String armamentType;
	boolean hasRadarAbsorbentMaterial;
	String launchSystemType;
	int endurance;

	public Submarine(int crewCapacity, String propulsionType, String material, int maxDepth, double speed,
			boolean isNuclearPowered, boolean hasSonar, String countryOfOrigin, int yearBuilt, int missileCapacity,
			boolean hasTorpedo, String color, String manufacturer, boolean isActive, String homePort, String hullType,
			int numberOfCompartments, int batteryCapacity, boolean hasEscapePod, String communicationSystem,
			String radarSystem, boolean hasStealthTechnology, String missionType, double fuelCapacity,
			boolean hasPeriscope, String navigationSystem, boolean hasAirlock, int enginePower, String propulsionSystem,
			boolean hasAntiSubmarineWeapons, String armamentType, boolean hasRadarAbsorbentMaterial,
			String launchSystemType, int endurance) {
		this.name = name;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.crewCapacity = crewCapacity;
		this.propulsionType = propulsionType;
		this.material = material;
		this.maxDepth = maxDepth;
		this.speed = speed;
		this.isNuclearPowered = isNuclearPowered;
		this.hasSonar = hasSonar;
		this.countryOfOrigin = countryOfOrigin;
		this.yearBuilt = yearBuilt;
		this.missileCapacity = missileCapacity;
		this.hasTorpedo = hasTorpedo;
		this.color = color;
		this.manufacturer = manufacturer;
		this.isActive = isActive;
		this.homePort = homePort;
		this.hullType = hullType;
		this.numberOfCompartments = numberOfCompartments;
		this.batteryCapacity = batteryCapacity;
		this.hasEscapePod = hasEscapePod;
		this.communicationSystem = communicationSystem;
		this.radarSystem = radarSystem;
		this.hasStealthTechnology = hasStealthTechnology;
		this.missionType = missionType;
		this.fuelCapacity = fuelCapacity;
		this.hasPeriscope = hasPeriscope;
		this.navigationSystem = navigationSystem;
		this.hasAirlock = hasAirlock;
		this.enginePower = enginePower;
		this.propulsionSystem = propulsionSystem;
		this.hasAntiSubmarineWeapons = hasAntiSubmarineWeapons;
		this.armamentType = armamentType;
		this.hasRadarAbsorbentMaterial = hasRadarAbsorbentMaterial;
		this.launchSystemType = launchSystemType;
		this.endurance = endurance;
	}

	public void displayDetails() {
		System.out.println(name);
		System.out.println(length);
		System.out.println(width);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(crewCapacity);
		System.out.println(propulsionType);
		System.out.println(material);
		System.out.println(maxDepth);
		System.out.println(speed);
		System.out.println(isNuclearPowered);
		System.out.println(hasSonar);
		System.out.println(countryOfOrigin);
		System.out.println(yearBuilt);
		System.out.println(missileCapacity);
		System.out.println(hasTorpedo);
		System.out.println(color);
		System.out.println(manufacturer);
		System.out.println(isActive);
		System.out.println(homePort);
		System.out.println(hullType);
		System.out.println(numberOfCompartments);
		System.out.println(batteryCapacity);
		System.out.println(hasEscapePod);
		System.out.println(communicationSystem);
		System.out.println(radarSystem);
		System.out.println(hasStealthTechnology);
		System.out.println(missionType);
		System.out.println(fuelCapacity);
		System.out.println(hasPeriscope);
		System.out.println(navigationSystem);
		System.out.println(hasAirlock);
		System.out.println(enginePower);
		System.out.println(propulsionSystem);
		System.out.println(hasAntiSubmarineWeapons);
		System.out.println(armamentType);
		System.out.println(hasRadarAbsorbentMaterial);
		System.out.println(launchSystemType);
		System.out.println(endurance);
	}
}
