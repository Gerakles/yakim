public class Main {
    public static void main (String [] args) {
        Stea stea = new Stea();

        float[] stea1_masses ={ 0f, 1f};
        float[] stea2_masses ={ 0f, 1.8f, 2.1f};
        String[] stea2_names ={ "Marte", "Jupiter", "Venus"};


        Stea stea2 = new Stea(2, stea2_masses, stea2_names, 200.56, "Pamint");
        Stea stea3 = new Stea(3,"Neptun");
        stea.setMasaPlanetelor(stea1_masses);

        System.out.println(stea.toString());
        System.out.println(stea2);
        System.out.println(stea3);

        System.out.println(
                String.format( "has %d planets, %s name", 12, "has" )
        );

        if(stea.equals(stea2)){
            System.out.println("Steau 1 egala cu Steau 2");
        } else {
            System.out.println("Steau 1  nu egala cu Steau 2");
        }



    }
}
