package com.epam.conversion;

public class MetertoInchConvert implements Convert {

	@Override
	public double convert(double number) {
		// TODO Auto-generated method stub
		final double value=39.701;
		return number*value;
	}

}
