package com.nayana.intreface;

public abstract class Provider {
	
	private String name;
	private String ceo;
	
	
	@Override
	public String toString() {
		return "provider [name=" + name + ", ceo=" + ceo + "]";
	}
	
	@Override
	public boolean equals(Object obj) 
	{
	if(obj!=null)
	{
		if(obj instanceof Provider) {
			Provider castProvider=(Provider)obj;
			if(name.equals(ceo))
			{
				System.out.println("Name & CEO are same");
				return true;
				
			}
			else
			{
				System.out.println("Name and Ceo are not equal");
			}
		}
		else {
			System.out.println("value is null");
		}
	}
		return super.equals(obj);
	}

	public Provider(String name, String ceo) 
	{
		super();
		this.name = name;
		this.ceo = ceo;
		System.out.println(this.name);
		System.out.println(this.ceo);
	}
	
	public abstract void service();
	{
		System.out.println("running in abstract service method");
	}
	
	

}
