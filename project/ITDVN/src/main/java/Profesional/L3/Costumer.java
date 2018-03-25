package Profesional.L3;

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
        return "Costumer{" +
                "fullName='" + fullName + '\'' +
                ", customerNumber=" + customerNumber +
                ", numOfAccounts=" + numOfAccounts +
                '}';
    }

    public void addAccount(Account acc) {
        accounts[numOfAccounts] = acc;
        numOfAccounts++;
    }
}
