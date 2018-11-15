package com.epam.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.epam.conversion.ConversionFactory;
import com.epam.conversion.Convert;

class MetertoInch {

	String status="metertoinch";
	ConversionFactory cf=new ConversionFactory();
	Convert obj=cf.getconvert(status);
		@Test
		void test() {
			
			assertEquals(476.41200000000003,obj.convert(12));
			
		}

}
