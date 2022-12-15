import java.util.*;
public class Lab505 {
   private static void inputStudent() {
	   Scanner scan = new Scanner(System.in);
	   System.out.print("Enter Student Id: ");
	   String id = scan.nextLine();
	   System.out.print("Enter Subject Id: ");
	   String sub = scan.nextLine();
	   
	   while(isLength(id.student,idsubject)) {
			System.out.print("Enter Student: ");
			id = scan.nextLine();
			System.out.print("Enter Subject: ");
			subject = scan.nextLine();
		}
	}
	public static boolean isLength(String item1,String item2) {
		if(item1.length()==10 && item2.length() == 7) {
		return true;	
		}
		return false;
		   
   }
}
