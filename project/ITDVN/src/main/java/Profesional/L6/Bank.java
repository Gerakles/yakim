package Profesional.L6;

public class Bank {
    private Costumer[] costumers = new Costumer[1000];
    private int numOfClients = 0;
    private static Bank myBank = new Bank();

    private Bank() {
    }

    public Costumer getCostumers(int custNr) {
        if (custNr < costumers.length)
            return costumers[custNr];
        return null;
    }

    public void addCostumers(Costumer newCostumers) {
        costumers[numOfClients] = newCostumers;
        numOfClients++;
    }

    public int getNumOfClients() {
        return numOfClients;
    }

    public static Bank getBank() {
        return myBank;
    }
}
