package Profesional.L3;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double initBalance, double interestRate) {
     this.balance = initBalance;
     this.interestRate = interestRate;
    }
    public void addInterestRate() {
        this.balance = this.balance+this.balance*interestRate/100;
    }
}
