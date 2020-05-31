package com.tanmoy.java7.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Java7Example {

	
	public static void main(String... args)
	{
		var switchString = "sunday";
		var big_number = 10_00_000;
		Predicate<String> p = s -> (null!= s && !s.isBlank());
		if(p.test(switchString))
		{
			switch(switchString.toUpperCase())
			{
				case "SUNDAY" : System.out.println("This is weekend");break;
				case "MONDAY" : System.out.println("This is weekday");break;
				case "TUESDAY" : System.out.println("This is weekday");break;
				case "WEDNESDAY" : System.out.println("This is weekday");break;
				case "THURSDAY" : System.out.println("This is weekday");break;
				case "FRIDAY" : System.out.println("This is weekday");break;
				case "SATURDAY" : System.out.println("This is weekend");break;
				default : System.out.println("Invalid day of week");break;
			}
		}
		System.out.println(big_number);
		System.out.println(big_number*2);
		
	}
}
