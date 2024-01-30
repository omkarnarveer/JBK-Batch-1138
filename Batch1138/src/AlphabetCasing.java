import java.util.Scanner;

public class AlphabetCasing {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sting to Toggle Case");
		String s1=sc.nextLine();
		
		//Test@123
		for(int i=0;i<s1.length();i++) {
			if(s1.codePointAt(i)>='A' && s1.codePointAt(i)<='Z' ) {
				s1.replace(s1.charAt(i),(char) s1.toLowerCase().codePointAt(i));
			}
			else if(s1.charAt(i)>='a' && s1.charAt(i)<='z' ) {
				s1.replace(s1.charAt(i),s1.charAt(i-32));
			}
			//else
				//s1.replace(s1.charAt(i),"#");
		}
	}
}
