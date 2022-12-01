import java.text.*;
import java.util.*;
public class PensionContributionCalculator {
	pubilc static void main(String[] args) {
	final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
	final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
	final double EMPLOYEE_RATE_55_TO_60 = 0.13;
	final double EMPLOYER_RATE_55_TO_60 = 0.13;
	final double EMPLOYEE_RATE_60_TO_65 = 0.075;
	final double EMPLOYER_RATE_60_TO_65 = 0.09;
	final double EMPLOYEE_RATE_65_ABOVE = 0.05;
	final double EMPLOYER_RATE_65_ABOVE = 0.075;
    DecimalFormat frm = new DecimalFormat("#,###.00");
	Scanner answer = new Scanner(System.in);
	System.out.print("Enter the mothly salary : $");
	int salary = answer.nextInt();
	System.out.print("Enter the age : ");
	int age = answer.nextInt();
	double ONE,TWO;
	if (age <= 55) { 
	......
	} else if (age <= 60) {
	......
	} else if (age <= 65) { 
	......
	} else { // above 65
	......
	}
  }
}
