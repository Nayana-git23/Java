package com.xworkz.protectedkeyword.internal;

public class Gun extends Weapon
{

	@Override
	protected void use()
	{
		System.out.println("Running in Gun of protected");
	}
	@Override
	public void fire()
	{
		System.out.println("Running in Gun of private");
	}
	
	public void display()
	{
		super.use();
		use();
		this.fire();
		fire();
		
	}
}
