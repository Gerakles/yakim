package L4;

public class TestAccount {
    public static void main(String[] args) {
        Costumer first = new Costumer( "John Doe" );
        Costumer second = new Costumer( "Jane Doe" );
        SavingsAccount johnSaving = new SavingsAccount( 1000, 7 );
        CheckingAccount johnAccount = new CheckingAccount( 5000, 1000 );
        CheckingAccount janeAccount = new CheckingAccount( 500, 100 );
        first.addAccount( johnSaving );
        first.addAccount( johnAccount );
        second.addAccount( janeAccount );
        Bank.addCostumers( first );
        Bank.addCostumers( second );

        System.out.println( Bank.getCostumers( 0 ) );
        System.out.println( Bank.getCostumers( 1 ) );

        Bank.getCostumers( 0 ).getAccount( 0 ).deposit( 2000 );
        Bank.getCostumers( 0 ).getAccount( 1 ).withdraw( 5500 );
        ((SavingsAccount) Bank.getCostumers( 0 ).getAccount( 0 )).addInterestRate();

        System.out.println("_______________________________");
        System.out.println( Bank.getCostumers( 0 ) );
        System.out.println( Bank.getCostumers( 1 ) );
    }
}
