import javax.swing.*;
import java.text.*;
import java.util.Random;
public class Lab303 {
	public static void main(String[] args) {
	Random rand =new Random();
	DecimalFormat frm = new DecimalFormat("##,###");
	int balance = rand.nextInt(9) * 100000;
	int withdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance:"+balance+"\ninput money to with draw : "));
	int sum = withdraw;
	int thousand = sum/1000;
	int fivehundred = (sum%1000)/500;
	int hundred = (sum%1000)%500/100;
	double Point = (double)balance%10;
	if (withdraw>=balance)
	{
		JOptionPane.showMessageDialog(null,"Error:Cannot withdraw more than bakance","ERROR",JOptionPane.ERROR_MESSAGE);
	}
	else if (withdraw>=20000)
	{
	    JOptionPane.showMessageDialog(null,"Error:Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
	}
	else if ((double)balance%10!=5)
	{
		int S = withdraw%100;
	    JOptionPane.showMessageDialog(null,"Error:Cannot withdraw"+S+"baht","ERROR",JOptionPane.ERROR_MESSAGE);
	}
	else
	{
		JOptionPane.showMessageDialog(null,"YOU withdraw"+frm.format(withdraw)+"baht."+"\n1,000="+thousand+"\n500="+fivehundred+"\n100="+hundred);
	}
  }
}
