package L8;

public class CheckingAccount extends Account {
    private double overDraftAmount;

    public CheckingAccount(double initBalance, double overDraftAmount) {
        this.balance = initBalance;
        this.overDraftAmount = overDraftAmount;
    }

    public CheckingAccount(double initBalance) {
        this( initBalance, 0 );
    }

    @Override
    public boolean withdraw(double awt) throws OverDraftException{
        if (awt <= balance + overDraftAmount) {
            balance = balance - awt;
            return true;
        }
        throw new OverDraftException( awt-balance-overDraftAmount,"Error! Insufficient funds!" );
    }

    public double getOverDraftAmount() {
        return overDraftAmount;
    }
}
