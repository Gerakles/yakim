package L8;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DataSource {
    private File dataFile;

    public DataSource(String dataFilePath) {
        dataFile = new File( dataFilePath );
    }

    public void loadData() throws IOException {
        Scanner input = new Scanner( dataFile );
        Bank bank = Bank.getBank();
        Costumer costumer;
        int numOfCustomers = input.nextInt();
        for (int i = 0; i < numOfCustomers; i++) {
            String firstName = input.next();
            String lastName = input.next();
            bank.addCostumers( new Costumer( firstName, lastName ) );
            costumer = bank.getCostumers( i );
            int numOfAccounts = input.nextInt();
            while (numOfAccounts-- > 0) {
                char accountType = input.next().charAt( 0 );
                switch (accountType) {
                    case 'S':
                        float initBalance = input.nextFloat();
                        float interestRate = input.nextFloat();
                        costumer.addAccount( new SavingsAccount( initBalance, interestRate ) );
                        break;
                    case 'C':
                        float initBalanse = input.nextFloat();
                        float overDraftAmount = input.nextFloat();
                        costumer.addAccount( new SavingsAccount( initBalanse, overDraftAmount ) );
                        break;

                }
            }
        }
    }
}
