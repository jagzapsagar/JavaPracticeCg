package com.example.demo.java8;

import java.util.Optional;

/*Why Optional Avoids NullPointerException:
The Optional class provides a safe way to handle the absence of a value.
With methods like ifPresent(), orElse(), and orElseGet(), you can check 
if a value is present and take action accordingly, avoiding direct null 
checks that might lead to a NullPointerException.

Summary:
Without Optional: Directly accessing a null value causes NullPointerException.
With Optional: You can handle the potential null values more gracefully and 
safely, preventing the exception and providing fallback values or actions.*/

public class OptionalClassex {
	public static void main(String[] args) {
		//String str = null;
		String str = "Str111";
		
		try {
			System.out.println(str.length());
		}catch(NullPointerException e){
			System.out.println(e);
		}
		System.out.println(str.isEmpty());
		System.out.println(str);
		
		
		String str2 = null;
		 // Using Optional to safely handle potential null value
		Optional<String> str3 = Optional.ofNullable(str2);
		// Using ifPresent() to safely check if the value is present
        str3.ifPresent(s -> System.out.println("Length of the string is: " + s.length()));

     // Using orElse() to provide a fallback if the value is absent (null)
        String result = str3.orElse("Default Value");
        System.out.println("The string is: " + result);
        
        Optional<String> opetionalWithValue = Optional.of("Hello");
        Optional<String> optionalWithNull = Optional.ofNullable(null);
        Optional<String> optionalEmpty = Optional.empty();
        
        System.out.println(opetionalWithValue);
        System.out.println(optionalWithNull);
        System.out.println(optionalEmpty);
        
	}

}
