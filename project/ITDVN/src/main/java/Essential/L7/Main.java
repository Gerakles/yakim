package Essential.L7;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone phone2 = new Phone();
        Computer computer = new Computer();
        Computer computer2 = new Computer();
        Mobile mobile = new Mobile();
        Mobile mobile2 = new Mobile();

        Computer[] computers = {computer, computer2, mobile};
        Phone[] phones = {phone, phone2, mobile2.createPhone()};

        for (Computer temp : computers ) {
            temp.process();
        }
        System.out.println("----------------------");
        for (Phone temp : phones) {
            temp.process();
        }
    }
}
