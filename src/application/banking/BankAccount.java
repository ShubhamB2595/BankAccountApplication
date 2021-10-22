package application.banking;

public class BankAccount {

	public static void main(String[] args) {

		System.out.println("Welcome to Bank account Application program");
		
        // Instantiate 2 saving account objects saver1 and saver2
        SavingAccount saver1, saver2;
        
        saver1 = new SavingAccount (2000.0);
        saver2 = new SavingAccount (3000.0);
        
        // Set the annual interest rate to 4 % = 4/100 = 0.04
        SavingAccount.modifyInterestRate (0.04);
        
        // Calculate monthly interest 
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        // Print new balances for both savers
        System.out.println("Saver 1 balance with 4% interest rate is: " + saver1.getSavingBalance());
        System.out.println("Saver 2 balance with 4% interest rate: " + saver2.getSavingBalance());

        // Set the annual interest rate to 5 % = 5/100 = 0.05
        SavingAccount.modifyInterestRate (0.05);
        
        // Calculate monthly interest 
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        // Print new balances for both savers
        System.out.println("Saver 1 balance with 5% interest rate is: "+ saver1.getSavingBalance());
        System.out.println("Saver 2 balance with 5% interest rate is: "+ saver2.getSavingBalance());

	}

}
