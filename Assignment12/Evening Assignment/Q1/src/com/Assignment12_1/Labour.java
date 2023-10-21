package com.Assignment12_1;

public class Labour implements Emp
{
	private int hours;
	private double rate;
	
	@Override
	public double getSal()
	{
	 return hours * rate;
	}

	@Override
	public double calcInsentives() {
		if(hours > 300)
			return 0.05*hours*rate;
		
		return 0.0;
			
		
		
	}

	public Labour(int hours, double rate) {
		this.hours = hours;
		this.rate = rate;
	}

	
		
	
	
	
	

}
