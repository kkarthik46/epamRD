package com.epam.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.epam.conversion.ConversionFactory;
import com.epam.conversion.Convert;

class InchtoFeet {

	String status="inchtofeet";
	ConversionFactory cf=new ConversionFactory();
	Convert obj=cf.getconvert(status);
		@Test
		void test() {
			
			assertEquals(0.99996,obj.convert(12));
			
		}

}
