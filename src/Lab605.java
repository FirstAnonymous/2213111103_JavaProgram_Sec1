import javax.swing.JOptionPane;

public class Lab605 {
	public static void main(String[] args) {
		
		int[] num = new int[5];
		for (int i = 0; i< num.length; i++)
		num [i]=Integer.parseInt(JOptionPane.showInputDialog("Input number " + (i+1) + " : "));
	showOdd(num);
	showEven(num);
	}
private static void showEven(int[] list) {
	String EvenMsg = "";
	for(int Even : list)
		if(Even %2 != 0)
			EvenMsg = EvenMsg + Even + " ";
	JOptionPane.showMessageDialog(null, "List of odd number : \n"
			+ EvenMsg, "Message",JOptionPane.INFORMATION_MESSAGE);
}
private static void showOdd(int[] list) {
	String OddMsg = "";
	for(int Odd : list)
		if(Odd %2 == 0)
			OddMsg = OddMsg + Odd + " ";
	JOptionPane.showMessageDialog(null, "List of even number: \n"
			+ OddMsg,"Message",JOptionPane.INFORMATION_MESSAGE);
  }
}