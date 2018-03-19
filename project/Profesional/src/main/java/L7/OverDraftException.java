package L7;

public class OverDraftException extends Exception {
    private double deficit;

    public double getDeficit() {
        return deficit;
    }

    public OverDraftException(double deficit,String message) {
        super( message );
        this.deficit = deficit;
    }
}
