import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionHandling {
public static void main(String[] args) {
 Scanner var = new Scanner(System.in);
 try {
 System.out.print("Enter A Number : ");
 int a = var.nextInt();
 System.out.print("Enter A Number : ");
 int b = var.nextInt();
 var.close();
 if(b==0) {
 throw new ArithmeticException("Division By Zero is not
possible");
 }
 else {
 System.out.println("Division = " + a/b);
 }
 }
 catch(ArithmeticException e) {
 System.out.println(e);
 }
 catch(InputMismatchException e) {
 System.out.println(e + ": Input MisMatch Exception");
 }
 }
} 
