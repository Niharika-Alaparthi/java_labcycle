package Currency;
public class Dollar {
public void DollarToINR(double dollar) {
 System.out.println("$ "+dollar +" in INR : Rs." + dollar*76);
 }
public void INRtoDollar(double inr) {
 System.out.println("Rs."+inr +" in Dollars : $" + inr/76);
 }
}
package Currency;
public class Euro {
public void EuroToINR(double euro) {
 System.out.println(euro +" Euros in INR : Rs." + euro*84);
 }
public void INRtoEuro(double inr) {
 System.out.println("Rs."+ inr +" in Euros : " + inr/84+" Euro");
 }
}
package Currency;
public class Yen {
public void YenToINR(double yen) {
 System.out.println(yen +" Yen in INR : Rs." + yen*0.64);
 }
public void INRtoYen(double inr) {
 System.out.println("Rs."+inr +" in Yen : " + inr/0.64 + " yen");
 }
}
package Distance;
public class Meter {
public void MeterToKM(double meter) {
 System.out.println(meter +" m in KM : " + meter/1000 + " KM");
 }
public void KMtoMeter(double km) {
 System.out.println(km +" KM in Meters : " + km*1000 +" m");
 }

}
package Distance;
public class Miles {
public void MilesToKM(double miles) {
 System.out.println(miles +" miles in KM : " + miles*1.6 +" km");
 }
public void KMtoMiles(double km) {
 System.out.println(km +" KM in Miles : "+ km/1.6 +" miles");
 }
}
package Time;
public class Minutes {
public void minsToHours(double mins) {
 System.out.println(mins +" mins in Hours : " + mins/60 + " hr");
 }
public void hoursToMins(double hour) {
 System.out.println(hour +" hr in Minutes : " + hour*60 +" min");
 }
}
package Time;
public class Seconds {
public void secsToHours(double secs) {
 System.out.println(secs +" sec in Hours : " + secs/(3600) + " hr");
 }
public void hoursToSecs(double hour) {
 System.out.println(hour +" hr in Seconds : " + hour*60*60 +" sec");
 }
}
import Currency.*;
import Distance.*;
import Time.*;
import java.util.Scanner;
public class Converter {
public static void main(String[] args) {
 Scanner var = new Scanner(System.in);
 Dollar D = new Dollar();
 Euro E = new Euro();
 Yen Y = new Yen();
 Meter M = new Meter();
 Miles Mi = new Miles();
 Minutes Min = new Minutes();
 Seconds S = new Seconds();
 System.out.println(" 1.Curreny Converter\n 2.Distance Converter\n
3.Time Converter\n");
 System.out.print("Enter an Option : ");
 int opt = var.nextInt();
 switch(opt) {
 case 1:
 System.out.println("***Currency Converter***");
 System.out.println(" 1.Dollar To INR\n 2.INR To Dollar\n
3.Euro To INR\n 4.INR To Euro\n 5.Yen To INR\n 6.INR To Yen\n");
 System.out.print("Enter an Option : ");
 int option = var.nextInt();
 switch(option) {
 case 1:

 System.out.print("\nEnter value in Dollars : ");
 double dollar = var.nextDouble();
 D.DollarToINR(dollar);
break;
 case 2:
 System.out.print("\nEnter value in INR : ");
 double rup = var.nextDouble();
 D.INRtoDollar(rup);
break;
 case 3:
 System.out.print("\nEnter value in Euros : ");
 double euro = var.nextDouble();
 E.EuroToINR(euro);
break;
 case 4:
 System.out.print("\nEnter value in INR : ");
 double inr = var.nextDouble();
 E.INRtoEuro(inr);
break;
 case 5:
 System.out.print("\nEnter value in Yen : ");
 double yen = var.nextDouble();
 Y.YenToINR(yen);
break;
 case 6:
 System.out.print("\nEnter value in INR : ");
 double rupee = var.nextDouble();
 Y.INRtoYen(rupee);
break;
 default:
 System.out.println("Invalid Option");
 }
 break;
 case 2:
 System.out.println("***Distance Converter***");
 System.out.println(" 1.Meter To KM\n 2.KM To Meter\n 3.Miles
To KM\n 4.KM To Miles\n");
 System.out.print("Enter an Option : ");
 int option2 = var.nextInt();
 switch(option2) {
 case 1:
 System.out.print("\nEnter value in Meters : ");
 double meter = var.nextDouble();
 M.MeterToKM(meter);
break;
 case 2:
 System.out.print("\nEnter value in KM : ");
 double km = var.nextDouble();
 M.KMtoMeter(km);
break;
 case 3:
 System.out.print("\nEnter value in Miles : ");
 double miles = var.nextDouble();
 Mi.MilesToKM(miles);
break;
 case 4:
   System.out.print("\nEnter value in KM : ");
   double Km2 = var.nextDouble();
   Mi.KMtoMiles(Km2);
   break;
default:
   System.out.println("Invalid Option");
 }
 break;
 case 3:
 System.out.println("***Time Converter***");
 System.out.println(" 1.Minutes to Hours\n 2.Hours To Minutes\n
3.Seconds To Hours\n 4.Hours To Seconds\n");
 System.out.print("Enter an Option : ");
 int option3 = var.nextInt();
 switch(option3) {
 case 1:
 System.out.print("\nEnter value in Minutes : ");
 double mins = var.nextDouble();
 Min.minsToHours(mins);
break;
 case 2:
 System.out.print("\nEnter value in Hours : ");
 double hour1 = var.nextDouble();
 Min.hoursToMins(hour1);
break;
 case 3:
 System.out.print("\nEnter value in Seconds : ");
 double secs = var.nextDouble();
 S.secsToHours(secs);
break;
 case 4:
 System.out.print("\nEnter value in Hours : ");
 double hour2 = var.nextDouble();
 S.hoursToSecs(hour2);
break;
 default:
 System.out.println("Invalid Option");
 }
 break;

default:

System.out.println("Invalid Option");
 }
 var.close();
 }
} 
