package application.banking;
/*
 * Class to manage saving account operations
 */

public class SavingAccount {

	//Variables
    static private double annualInterestRate;
    private double savingBalance;
	
    //constructor method
    public SavingAccount()
    {

    }
    
    public SavingAccount(double savingBalance)
    {
            this.savingBalance = savingBalance;
    }
    

    //Method to calculate monthly interest 
    public void calculateMonthlyInterest()
    {
            double monthlyInt; 
            monthlyInt = (this.savingBalance * annualInterestRate / 12);
            this.savingBalance += monthlyInt;
    }
    
    // Modify interest rate by setting annual interest rate to a new value
    public static void modifyInterestRate(double newInterestRate)
    {
            annualInterestRate = newInterestRate;
    }

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingAccount.annualInterestRate = annualInterestRate;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
    
    

}
