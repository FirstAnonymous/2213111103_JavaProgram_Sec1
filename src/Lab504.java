import java.util.*;
public class Lab504 {
	   public static void main(String[] args) {
		   Scanner firstName = new Scanner(System.in);
		   System.out.println("Please enter your name, separated by a space.");
		   System.out.print(":");
		   String fullName = firstName.nextLine();
		   System.out.println(abbreviatName(fullName) + "." + fullName.substring(0, fullName.indexOf(" ")));
	   }
	   public static String abbreviatName(String fullname) {
		   String[] space = fullname.split(" ");
		   return space[space.length-2].toUpperCase().charAt(0) + "." + space[space.length-1].toUpperCase().charAt(0) ;
	   }
}
