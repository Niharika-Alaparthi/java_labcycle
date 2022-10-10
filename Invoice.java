import java.util.Scanner;
class Invoice{
	String partnumber;
	String partdescription;
	int quantity;
	double priceperitem;
	Invoice(){
		partnumber="";
		partdescription="";
		quantity=0;
		priceperitem=0.0;
	}
	void setpartnumber(String partnumber) {
		this.partnumber=partnumber;
	}
	String getpartnumber() {
		return partnumber;
	}
	void setpartdescription(String partdescription) {
		this.partdescription=partdescription;
	}
	String getpartdescription() {
		return partdescription;
	}
	void setquantity(int quantity) {
		if (quantity<0)
			quantity=0;
		else
		    this.quantity=quantity;
	}
	int getquantity() {
		return quantity;
	}
	void setpriceperitem(double priceperitem) {
		if (priceperitem<0)
			priceperitem=0.0;
		else
		    this.priceperitem=priceperitem;
	}
	double getpriceperitem() {
		return priceperitem;
	}
	double getInvoiceAmount() {
		double amount=quantity*priceperitem;
		return amount;
	}
}

public class InvoiceTest
{
  public static void main(String[] args) 
  {
      Scanner sc=new Scanner(System.in);
      Invoice in=new Invoice();
      System.out.print("Enter part number :");
      in.setpartnumber(sc.next());
      System.out.print("Enter no. of items purchased :");
      in.setquantity(sc.nextInt());
      System.out.print("Enter part description :");
      in.setpartdescription(sc.next());
      System.out.print("Enter price per item :");
      in.setpriceperitem(sc.nextDouble());
      System.out.print(" Item Details \n");
      System.out.print("Part number :" + in.getpartnumber()+"\n");
      System.out.print("\nPart description :" + in.getpartdescription()+"\n");
      System.out.print("\nTotal Billing Amount :" + in.getInvoiceAmount()+"\n");
  }
}


