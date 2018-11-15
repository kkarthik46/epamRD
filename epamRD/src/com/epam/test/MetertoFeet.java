/**
 * 
 */
package com.epam.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.epam.conversion.ConversionFactory;
import com.epam.conversion.Convert;

/**
 * @author Karthik_K
 *
 */
class MetertoFeet {

	String status="metertofeet";
	ConversionFactory cf=new ConversionFactory();
	Convert obj=cf.getconvert(status);
		@Test
		void test() {
			
			assertEquals(39.37008,obj.convert(12));
			
		}

}
