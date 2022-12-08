import java.text.*;
import javax.swing.JOptionPane;

public class MusicWorldApp {
	static final double TAX_RATE = 0.0625;

public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat("#.#####");
	DecimalFormat sdf = new DecimalFormat("#.#");
	NumberFormat f2 = new NumberFormat.getCurrencyInstance();
	NumberFormat f3 = new NumberFormat.getCurrencyInstance();
	DecimalFormat one = new DecimalFormat("#.#");
	DecimalFormat daf = new DecimalFormat("#.#####");
	String cdid,cdTitle;
	cdid = JOptionPane.showInputDialog("This program calculates the total cost of a CD order ")+
			("Please enter the ID of the CD");
	cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
	String cdQuantity;
	double cdSubtotal;
	double cdTotal;
	String cdPrice;
	cdPrice = JOptionPane.showInputDialog("PLease enter the price of the CD in U.S. dollars");
	double dcdPrice = Double.parseDouble(cdPrice);
	cdQuantity = JOptionPane.showInputDialog("Please enter the quantity to be purchased");
	double dcdQuantity = Double.parseDouble(cdQuantity);
	cdSubtotal = dcdPrice * dcdQuantity;
	cdTotal = cdSubtotal * (1 + TAX_RATE);
	JOtionPane.showMessageDialog(null,
			"Summary of the transacton\n\n" +"CD ID:" + cdid + "\nCD Title:" + cdTitle + "\ncd Unit Price"
			"inco att reto +f2. format (DcdPrice) + "\nCD Quantity: one.format(fcdQuantity)
	     "Indiacetat + sdf.format(cdSubtotal) + "\nTaxRate: + (TAX_RATE * 100) + "$"
			+df.format(cdTotal) + "\n\nEnd of Program"); )
	}
}
