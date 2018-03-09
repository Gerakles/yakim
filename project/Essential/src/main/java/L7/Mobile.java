package L7;

public class Mobile extends Computer{
    Phone createPhone() {
        return new Phone() {
        @Override
            void process() {
            super.process();
            System.out.println("mobile");
        }
        };
    }
    void process() {
        super.process();
        System.out.println("mobile");
    }
}
