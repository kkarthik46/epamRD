package com.epam.conversion;

public class InchtoFeetConvert implements Convert {

	@Override
	public double convert(double number) {
		// TODO Auto-generated method stub
		final double value=0.08333;
		return number*value;
	}

}
