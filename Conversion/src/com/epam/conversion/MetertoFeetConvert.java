package com.epam.conversion;

public class MetertoFeetConvert implements Convert {

	@Override
	public double convert(double number) {
		// TODO Auto-generated method stub
		final double value=3.28084;
		return number*value;
	}

}
