import java.util.Scanner;

public class Names {

	public static void main(String[] args) {

		String name,midName,surName;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter name");
		name=sc.nextLine().toUpperCase();
		System.out.println("Enter midname");
		midName=sc.nextLine().toUpperCase();
		System.out.println("Enter surname");
		surName=sc.nextLine().toUpperCase();

		String si=surName.substring(1, surName.length()).toLowerCase();

		sc.close();
		System.out.println(name.charAt(0)+". "+
				midName.charAt(0)+". "+
				surName.charAt(0)+si);
	}
}