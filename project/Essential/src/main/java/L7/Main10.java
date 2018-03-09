package L7;

enum Company {
    Yakim( 1000 ), Google( 100 ), School( 10 );
    int value;

    Company(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Main10 {
    public static void main(String[] args) {
        Company mycomp = Company.Yakim;
        System.out.println("I work in the "+ mycomp+ " and I make "+mycomp.getValue()+" $ per day");
    }
}
