import java.util.Scanner;
public class Lab403 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Message : ");
		String Message = scanner.nextLine();
		String LowerMessage = Message.toLowerCase();
		if (LowerMessage.indexOf("nichi")>=0) {
			System.out.println("Nichi is a message");
		}
		else {
			System.out.print(Message);
		}
	}
}
