package Profesional.L8;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Costumer> costumers = new ArrayList <>(  );
    private int numOfClients = 0;
    private static Bank myBank = new Bank();

    private Bank() {
    }

    public Costumer getCostumers(int custNr) {
        if (custNr < costumers.size())
            return costumers.get( custNr );
        return null;
    }

    public void addCostumers(Costumer newCostumers) {
        costumers.add( newCostumers );
        numOfClients++;
    }

    public int getNumOfClients() {
        return numOfClients;
    }

    public static Bank getBank() {
        return myBank;
    }
}