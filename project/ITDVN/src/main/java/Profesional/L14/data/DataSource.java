/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesional.L14.data;

import Profesional.L14.domain.Bank;
import Profesional.L14.domain.CheckingAccount;
import Profesional.L14.domain.Customer;
import Profesional.L14.domain.SavingsAccount;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Taurus
 */
public class DataSource {

    private File dataFile;

    public DataSource(String dataFilePath) {
        dataFile = new File(dataFilePath);
    }

    public void loadData() throws IOException {
        Scanner input = new Scanner(dataFile);
        Bank bank = Bank.getBank();

        Customer customer;

        int numOfCustomers = input.nextInt();
        for (int i = 0; i < numOfCustomers; i++) {
            String firstName = input.next();
            String lastName = input.next();
            bank.addCustomer(new Customer(firstName, lastName));
            customer = bank.getCustomer(i);

            int numOfAccounts = input.nextInt();
            while (numOfAccounts-- > 0) {
                char accountType = input.next().charAt(0);
                switch (accountType) {
                    case 'S': {
                        float initBalance = input.nextFloat();
                        float interestRate = input.nextFloat();
                        customer.addAccount(new SavingsAccount(initBalance, interestRate));
                        break;
                    }
                    case 'C': {
                        float initBalance = input.nextFloat();
                        float overdraftAmount = input.nextFloat();
                        customer.addAccount(new CheckingAccount(initBalance, overdraftAmount));
                        break;

                    }
                }
            }
        }
    }

}
