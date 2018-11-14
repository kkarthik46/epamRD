package com.epam.conversion;

public class ConversionFactory {
	public Convert getconvert(String ConvertString)
	{
		if(ConvertString==null)
		{
			return null;
		}
		else if(ConvertString.equalsIgnoreCase("metertoinch"))
		{
			return new MetertoInchConvert();
		}
		else if(ConvertString.equalsIgnoreCase("inchtometer"))
		{
			return new InchtoMeterConvert();
		}
		else if(ConvertString.equalsIgnoreCase("inchtofeet"))
		{
			return new InchtoFeetConvert();
		}
		else if(ConvertString.equalsIgnoreCase("feettoinch"))
		{
			return new FeettoInchConvert();
		}
		else if(ConvertString.equalsIgnoreCase("metertofeet"))
		{
			return new MetertoFeetConvert();
		}
		else if(ConvertString.equalsIgnoreCase("feettometer"))
		{
			return new FeettoMeterConvert();
		}
		return null;

}
}
