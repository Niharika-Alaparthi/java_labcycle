import java.util.Scanner;
class ElectricityBill {
	String cnum,cname;
	int type;
	double pmr,cmr,amount,units;
	ElectricityBill(){
	    cnum="";
	    cname="";
	    type=0;
	    pmr=0.0;
	    cmr=0.0;
	}
	
	double amountcal() {
		units=cmr-pmr;
		if (type==1)
		{
			if (units<100)
				amount=units*1;
			else if (units<=200)
		    	 amount=100+(units-100)*2.50;
			else if (units<=500)
		    		amount=100+250+(units-200)*4;
		    else
		    	amount=units*6;
		}
		if (type==2){
				if (units<100)
					amount=units*2;
				else if (units<=200)
			    		amount=200+(units-100)*4.50;
				else if (units<=500)
			    		amount=200+450+(units-200)*6;
			    else
			    	amount=units*7;
		}
		if (type!=1 && type!=2){
		    System.out.println("enter valid type ");
		}
		return amount;
	    }

}

public class ElectricityBillTest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ElectricityBill eb=new ElectricityBill();
        System.out.println("Enter consumer number:");
        eb.cnum=sc.next();
        System.out.println("enter consumer name:");
        eb.cname=sc.next();
        System.out.println("enter previous month readings");
        eb.pmr=sc.nextInt();
        System.out.println("enter current month readingsr");
        eb.cmr=sc.nextInt();
        System.out.println("enter 1 if eb connection is domestic,2 if commercial");
        eb.type=sc.nextInt();
        System.out.println("consumer name"+eb.cname());
        System.out.println("consumer numbrr"+eb.cnum());
        System.out.println(eb.amountcal());
    }
}
