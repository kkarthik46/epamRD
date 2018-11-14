package com.epam.conversion;

import java.util.Scanner;

public class FactoryPatternConvert {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("feettoinch\n"+"feettometer\n"+"inchtofeet\n"+"inchtometer\n"+"metertofeet\n"+"metertoinch\n");
	System.out.println("enter the choice");
	String choice=sc.next();
	ConversionFactory cf=new ConversionFactory();
	Convert obj=cf.getconvert(choice);
	System.out.println("enter number");
	double number=sc.nextDouble();
	System.out.println(obj.convert(number));
	
	
	}	
	

}
