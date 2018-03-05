public class stringdilder {
    public static void main(String[] args) {
        String custName = "Iachimciuc Bogdan";
        String firstName;
        int spaceIdx;

        spaceIdx = custName.indexOf( " " );
        System.out.println(spaceIdx);

        firstName = custName.substring( 0, spaceIdx );
        System.out.println(firstName);

        StringBuilder sb = new StringBuilder( firstName );
        sb.append( " Bogdan" );
        System.out.println(sb);

        sb.append( custName.substring(spaceIdx) );
        System.out.println(sb);
    }
}
