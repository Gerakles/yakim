package L2.Test;

import L2.Domain.Account;

public class TestAccount {
    public static void main(String[] args) {
        Account myAc = new Account( 255.86 );
        myAc.deposit( 120 );
        myAc.withdraw( 120 );
        myAc.withdraw( 400 );
        System.out.println("Account balance is $"+ myAc.getBalance() );
    }
}
