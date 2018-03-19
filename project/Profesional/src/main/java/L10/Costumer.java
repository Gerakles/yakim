package L10;

import L9.Account;
import L9.CheckingAccount;
import L9.SavingsAccount;

import java.util.ArrayList;

public class Costumer {
    private static int customerNumberBase = 1000;
    private ArrayList <Account> accounts;
    private String firstName;
    private String lastName;
    private int customerNumber;
    private int numOfAccounts;

    public Costumer(String firstName, String lastName) {
        accounts = new ArrayList <>();
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerNumber = customerNumberBase++;
        this.numOfAccounts = 0;
    }

    public Account getAccount(int accNr) {
        if (accNr < accounts.size() && numOfAccounts != 0)
            return accounts.get( accNr );
        return null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumOfAccounts() {
        return numOfAccounts;
    }

    @Override
    public String toString() {
        String s = "Costumer " +
                "fullName = " + firstName + " " + lastName +
                ", customerNumber = " + customerNumber +
                ", numOfAccounts = " + numOfAccounts;
        for (int i = 0; i < this.numOfAccounts; i++) {
            Account acc = getAccount( i );
            if (acc instanceof SavingsAccount)
                s = s + "\n\t" + (i + 1) + " Saving account with interest rate % " + ((SavingsAccount) acc).getInterestRate();
            else
                s = s + "\n\t" + (i + 1) + " Checking account with overdraft $ " + ((CheckingAccount) acc).getOverDraftAmount();
            s = s + ", balance $ " + acc.getBalance();
        }
        s = s + "\n";
        return s;
    }

    public void addAccount(Account acc) {
        accounts.add( acc );
        numOfAccounts++;
    }
}
