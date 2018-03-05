package impl;

public class NotStartedException extends RuntimeException {
    @Override
    public String getMessage() {
        return "bla bla bla, cursul trebuie pornit";
    }
}
