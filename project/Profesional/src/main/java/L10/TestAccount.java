package L10;

import L9.Bank;
import L9.CheckingAccount;
import L9.Costumer;
import L9.OverDraftException;
import L9.SavingsAccount;

public class TestAccount { //10.322 kb
    public static void main(String[] args) {
        Bank bank = Bank.getBank();
        Costumer first = new Costumer( "John", "Doe" );
        Costumer second = new Costumer( "Jane","Doe" );
        SavingsAccount johnSaving = new SavingsAccount( 1000, 7 );
        CheckingAccount johnAccount = new CheckingAccount( 5000, 1000 );
        CheckingAccount janeAccount = new CheckingAccount( 500, 100 );
        first.addAccount( johnSaving );
        first.addAccount( johnAccount );
        second.addAccount( janeAccount );
        bank.addCostumers( first );
        bank.addCostumers( second );

        displayCustomer( bank );

        bank.getCostumers( 0 ).getAccount( 0 ).deposit( 2000 );
        try {
            bank.getCostumers( 0 ).getAccount( 1 ).withdraw( 7500 );
        } catch (OverDraftException oe) {
            System.out.println( oe.getMessage() + ": $ " + oe.getDeficit() + "!" );
        } catch (Exception e) {
            System.out.println( "Somthing went wrong" + e.getMessage() );
        }
        ((SavingsAccount) bank.getCostumers( 0 ).getAccount( 0 )).addInterestRate();

        System.out.println( "_______________________________" );
        displayCustomer( bank );
    }

    private static void displayCustomer(Bank bank) {
        System.out.println( bank.getCostumers( 0 ) );
        System.out.println( bank.getCostumers( 1 ) );
    }
}
