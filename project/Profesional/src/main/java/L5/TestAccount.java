package L5;

public class TestAccount {
    public static void main(String[] args) {
        Bank bank = Bank.getBank();
        Costumer first = new Costumer( "John Doe" );
        Costumer second = new Costumer( "Jane Doe" );
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
        bank.getCostumers( 0 ).getAccount( 1 ).withdraw( 5500 );
        ((SavingsAccount) bank.getCostumers( 0 ).getAccount( 0 )).addInterestRate();

        System.out.println("_______________________________");
        displayCustomer( bank );
    }

    private static void displayCustomer(Bank bank) {
        System.out.println( bank.getCostumers( 0 ) );
        System.out.println( bank.getCostumers( 1 ) );
    }
}
