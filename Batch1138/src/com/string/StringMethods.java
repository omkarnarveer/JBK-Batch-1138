package com.string;

public class StringMethods {
    
	public static void main(String[] args) {
        
		String s1 = "Hello Java ";
        // codePointAt
        int codePoint = s1.codePointAt(6);
        System.out.println("Code point at index 6: " + codePoint);
        // startsWith
        boolean startsWithHello = s1.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);
        // endsWith
        boolean endsWithSpace = s1.endsWith(" ");
        System.out.println("Ends with space: " + endsWithSpace);
        // toUpperCase
        String upperCaseString = s1.toUpperCase();
        System.out.println("Uppercase: " + upperCaseString);
        // toLowerCase
        String lowerCaseString = s1.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseString);
        // equals
        String otherString = "Hello Java ";
        boolean isEqual = s1.equals(otherString);
        System.out.println("Equals 'Hello Java ': " + isEqual);
        // equalsIgnoreCase
        String caseInsensitiveString = "hello java ";
        boolean isEqualIgnoreCase = s1.equalsIgnoreCase(caseInsensitiveString);
        System.out.println("EqualsIgnoreCase 'hello java ': " + isEqualIgnoreCase);

        // repeat
        String repeatedString = s1.repeat(3);
        System.out.println("Repeated 3 times: " + repeatedString);

        // replace
        String replacedString = s1.replace('o', 'X');
        System.out.println("Replace 'o' with 'X': " + replacedString);

        // trim
        String trimmedString = s1.trim();
        System.out.println(s1);
        System.out.println("Trimmed: " + trimmedString);
    }
}