package Profesional.L4;

public class Bank {
    private static Costumer[] costumers = new Costumer[1000];
    private static int numOfClients = 0;

    private Bank() {
    }

    public static Costumer getCostumers(int custNr) {
        if (custNr < costumers.length)
            return costumers[custNr];
        return null;
    }

    public static void addCostumers(Costumer newCostumers) {
        costumers[numOfClients] = newCostumers;
        numOfClients++;
    }

    public static int getNumOfClients() {
        return numOfClients;
    }
}
