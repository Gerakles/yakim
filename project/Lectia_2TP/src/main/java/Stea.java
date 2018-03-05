import java.util.Arrays;

public class Stea {
    private int steanrplanete;
    private float[] masaPlanetelor;
    private String[] denumirea;
    private double masa;
    private String numele;
    private double diametru;

    static int instance;

    Stea() {

    }

    public Stea(double masa, String numele) {
        this.masa = masa;
        this.numele = numele;
    }

    public Stea(int steanrplanete, float[] masaPlanetelor, String[] denumirea, double masa, String numele) {
        this.steanrplanete = steanrplanete;
        this.masaPlanetelor = masaPlanetelor;
        this.denumirea = denumirea;
        this.masa = masa;
        this.numele = numele;
        this.diametru = diametru;
    }

    public int getSteanrplanete() {
        return steanrplanete;
    }

    public void setSteanrplanete(int steanrplanete) {
        this.steanrplanete = steanrplanete;
    }

    public float[] getMasaPlanetelor() {
        return masaPlanetelor;
    }

    public void setMasaPlanetelor(float[] masaPlanetelor) {
        this.masaPlanetelor = masaPlanetelor;
    }

    public String[] getDenumirea() {
        return denumirea;
    }

    public void setDenumirea(String[] denumirea) {
        this.denumirea = denumirea;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public String getNumele() {
        return numele;
    }

    public void setNumele(String numele) {
        this.numele = numele;
    }

    public double getDiametru() {
        return diametru;
    }

    public void setDiametru(double diametru) {
        this.diametru = diametru;
    }

    public static int getInstance() {
        return instance;
    }

    public static void setInstance(int instance) {
        Stea.instance = instance;
    }

    @Override
    public String toString() {
        return "__________________" +"\n"
                + this.numele+"\n" + "------------------"+"\n"
                + "№ de Planete a stelei: " + this.steanrplanete+"\n";
    }

    public float masaTuturorPlanetelor() {
        float sum = 0;

        for (int i=0; i<masaPlanetelor.length; i++) {
            sum=sum+masaPlanetelor[i];
        }

        return sum;

    }

    public boolean equals(Stea stea) {
        boolean b = (this.masaTuturorPlanetelor() == stea.masaTuturorPlanetelor());
        return b;
    }

}
