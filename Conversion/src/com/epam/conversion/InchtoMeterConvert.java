package com.epam.conversion;

public class InchtoMeterConvert implements Convert {

	@Override
	public double convert(double number) {
		// TODO Auto-generated method stub
		final double value=0.0254;
		return number*value;
	}

}
