import java.util.*;

public class Lab401 {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Full name : ");
		String fullname = kb.nextLine();
		
		if(!fullname.contains(" ")) {
			  System.out.print("Incorrect Name");
			  return;
		}
		
		int spaceIndex = fullname.indexOf(" ");
		String firstname = fullname.substring(0,spaceIndex).toUpperCase();
		String lastname = fullname.substring(spaceIndex,fullname.length()).toLowerCase();
		System.out.println("First name:"+firstname);
		System.out.println("Last name:"+lastname);
		
	}
}
