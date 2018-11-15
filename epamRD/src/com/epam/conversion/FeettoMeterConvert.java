package com.epam.conversion;

public class FeettoMeterConvert implements Convert {

	@Override
	public double convert(double number) {
		// TODO Auto-generated method stub
		final double value=0.3048;
		return number*value;
	}

}
