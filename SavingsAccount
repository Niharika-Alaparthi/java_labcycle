class SavingsAccount
{
    static double annualinterest;
    double savingsbalance;
	public SavingsAccount(double balance) 
	{
		savingsbalance=balance;
		annualinterest=0;
	}
	public void calculateMonthlyInterestRate()
	 {
		System.out.println("current balance:"+savingsbalance);
		double monthlyinterest;
		monthlyinterest=(savingsbalance*annualinterest)/12;
		savingsbalance=savingsbalance+monthlyinterest;
		System.out.println("new balance:"+savingsbalance);
	}
	double getbalance() 
	{
		return savingsbalance;
	}

    void modifyInterest(double new_interest) 
	{
    	annualinterest=new_interest;
	}
}
public class SavingsAccountTest {
	public static void main(String args[]) 
	{
		SavingsAccount s1=new SavingsAccount(2000);
		SavingsAccount s2=new SavingsAccount(3000);
		s1.modifyInterest(0.04);
		s1.calculateMonthlyInterestRate();
		s2.modifyInterest(0.04);
		s2.calculateMonthlyInterestRate();
		System.out.println("after changing interest rate from 4% to 5%");
		s1.modifyInterest(0.05);
		s1.calculateMonthlyInterestRate();
		s2.modifyInterest(0.05);
		s2.calculateMonthlyInterestRate();
	}

}
