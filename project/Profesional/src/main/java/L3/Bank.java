package L3;

public class Bank {
    private Costumer[] costumers;
    private int numOfClients;

    public Bank() {
        costumers = new Costumer[1000];
        numOfClients = 0;
    }

    public Costumer getCostumers(int custNr) {
        if (custNr<costumers.length)
            return costumers[custNr];
        return null;
    }

    public void addCostumers(Costumer newCostumers) {
        costumers[numOfClients] = newCostumers;
        numOfClients++;
    }
}
