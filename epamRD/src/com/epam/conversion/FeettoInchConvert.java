package com.epam.conversion;

public class FeettoInchConvert implements Convert {

	@Override
	public double convert(double number) {
		// TODO Auto-generated method stub
		final int value=12;
		return number*value;
	}
	

}
