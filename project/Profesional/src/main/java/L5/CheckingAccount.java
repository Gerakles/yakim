package L5;

public class CheckingAccount extends Account {
    private double overDraftAmount;

    public CheckingAccount(double initBalance, double overDraftAmount) {
        this.balance = initBalance;
        this.overDraftAmount = overDraftAmount;
    }

    public CheckingAccount(double initBalance) {
        this(initBalance, 0);
    }
    @Override
    public boolean withdraw(double awt) {
        if (awt<=balance+overDraftAmount) {
            balance=balance-awt;
            return true;
        }
        return false;
    }

    public double getOverDraftAmount() {
        return overDraftAmount;
    }
}
