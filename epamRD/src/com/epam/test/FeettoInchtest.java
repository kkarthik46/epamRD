package com.epam.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.epam.conversion.ConversionFactory;
import com.epam.conversion.Convert;

class FeettoInchtest {
String status="feettoinch";
ConversionFactory cf=new ConversionFactory();
Convert obj=cf.getconvert(status);
	@Test
	void test() {
		
		assertEquals(144.0,obj.convert(12.0));
		
	}

}
