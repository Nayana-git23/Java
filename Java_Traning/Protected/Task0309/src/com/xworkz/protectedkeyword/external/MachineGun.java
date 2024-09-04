package com.xworkz.protectedkeyword.external;

import com.xworkz.protectedkeyword.internal.Weapon;

public class MachineGun extends Weapon {
	protected void use()
	{
		System.out.println("running use in MachineGun");
	}
	@Override
	public void fire()
	{
		System.out.println("running fire in MachineGun");
	}

	public void print()
	{
		super.use();
		super.fire();

	}

}
