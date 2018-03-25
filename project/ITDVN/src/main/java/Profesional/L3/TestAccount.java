package Profesional.L3;

public class TestAccount {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        Costumer first = new Costumer( "John Doe" );
        Costumer second = new Costumer( "Jane Doe" );
        SavingsAccount johnSaving = new SavingsAccount( 1000, 7 );
        CheckingAccount johnAccount = new CheckingAccount( 5000, 1000 );
        CheckingAccount janeAccount = new CheckingAccount( 500, 100 );
        first.addAccount( johnSaving );
        first.addAccount( johnAccount );
        second.addAccount( janeAccount );
        myBank.addCostumers( first );
        myBank.addCostumers( second );

        System.out.println(myBank.getCostumers( 0 ));
        myBank.getCostumers( 0 ).getAccount( 0 ).deposit( 2000 );
        myBank.getCostumers( 0 ).getAccount( 1 ).withdraw( 5500 );
        ((SavingsAccount)myBank.getCostumers( 0 ).getAccount( 0 )).addInterestRate();

        System.out.println(myBank.getCostumers( 0 ).getAccount( 0 ).getBalance());
        System.out.println(myBank.getCostumers( 0 ).getAccount( 1 ).getBalance());

        System.out.println(myBank.getCostumers( 1 ));
    }
}
