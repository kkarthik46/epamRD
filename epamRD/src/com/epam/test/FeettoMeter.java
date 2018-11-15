package com.epam.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.epam.conversion.ConversionFactory;
import com.epam.conversion.Convert;

class FeettoMeter {

	String status="feettometer";
	ConversionFactory cf=new ConversionFactory();
	Convert obj=cf.getconvert(status);
		@Test
		void test() {
			
			assertEquals(3.6576000000000004,obj.convert(12));
			
		}

}
