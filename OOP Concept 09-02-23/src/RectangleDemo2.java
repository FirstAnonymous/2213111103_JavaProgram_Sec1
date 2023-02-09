import java.util.*;
public class RectangleDemo2 {
  public static void main(String[] args) {
	 try (Scanner scan = new Scanner(System.in)) {
		System.out.print("Input width : ");
		double width = scan.nextDouble();
		System.out.print("Input length : ");
		double length = scan.nextDouble();
		
		 Rectangle2 rec = new Rectangle2(width,length);
		 System.out.print(rec);
		 System.out.print("Area of Rectangle is "+rec.getArea());
	}
 }
}