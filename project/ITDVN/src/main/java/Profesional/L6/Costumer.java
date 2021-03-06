package Profesional.L6;

public class Costumer {
    private static int customerNumberBase = 1000;
    private Account[] accounts;
    private String fullName;
    private int customerNumber;
    private int numOfAccounts;

    public Costumer(String fullName) {
        accounts = new Account[10];
        this.fullName = fullName;
        this.customerNumber = customerNumberBase++;
        this.numOfAccounts = 0;
    }

    public Account getAccount(int accNr) {
        if (accNr < accounts.length && numOfAccounts != 0)
            return accounts[accNr];
        return null;
    }

    @Override
    public String toString() {
        String s = "Costumer " +
                "fullName = " + fullName +
                ", customerNumber = " + customerNumber +
                ", numOfAccounts = " + numOfAccounts;
        for (int i = 0; i < this.numOfAccounts; i++) {
            Account acc = getAccount( i );
            if (acc instanceof SavingsAccount)
                s = s + "\n\t"+(i+1)+" Saving account with interest rate % " + ((SavingsAccount) acc).getInterestRate();
            else
                s = s + "\n\t"+(i+1)+" Checking account with overdraft $ " + ((CheckingAccount) acc).getOverDraftAmount();
            s = s + ", balance $ " + acc.getBalance();
        }
        s=s+"\n";
        return s;
    }

    public void addAccount(Account acc) {
        accounts[numOfAccounts] = acc;
        numOfAccounts++;
    }
}
