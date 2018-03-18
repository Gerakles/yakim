package L6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BankTest {
    Bank bank = Bank.getBank();
    Costumer first = new Costumer( "John Doe" );
    Costumer second = new Costumer( "Jane Doe" );

    @org.junit.Before
    public void setUp() throws Exception {
        SavingsAccount johnSaving = new SavingsAccount( 1000, 7 );
        CheckingAccount johnAccount = new CheckingAccount( 5000, 1000 );
        CheckingAccount janeAccount = new CheckingAccount( 500, 100 );
        first.addAccount( johnSaving );
        first.addAccount( johnAccount );
        second.addAccount( janeAccount );
        bank.addCostumers( first );
        bank.addCostumers( second );
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getCostumers() throws Exception {
    }

    @org.junit.Test
    public void addCostumers() throws Exception {
    }

    @org.junit.Test
    public void getNumOfClients() throws Exception {
    }

    @Test
    public void getBank() throws Exception {
        System.out.println("getBank");
        Bank expResult = bank;
        Bank result = Bank.getBank();
        assertEquals(expResult, result);
    }

}