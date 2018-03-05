public class indexofr {
    public static void main(String[] args) {
        String custName = "Iachimciuc ";
        String firstName;
        int spaceIdx;

        spaceIdx = custName.indexOf( " " );
        System.out.println(spaceIdx);

        firstName = custName.substring( 0, spaceIdx );
        System.out.println(firstName);
    }
}
