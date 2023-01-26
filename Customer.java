
public class Customer {
     private int ID;
     private String Name;
     private int Discount;
     
     private Customer (int ID , String Name ,int Discount) {
 		this.ID = ID;
 		this.Name = Name;
 		this.Discount = Discount;
     }
     public int getID() {
 		return this.ID;
 	}
 	public String getName() {
 		return this.Name;
 	}
 	public int getDiscount() {
 		return this.Discount;
 	}
 	public void setDiscount(int discount) {
 		this.Discount = discount;
 	}
 	public String toString () {
		return Name+"("+ID+")"+"("+Discount+"%)";
	}
}
