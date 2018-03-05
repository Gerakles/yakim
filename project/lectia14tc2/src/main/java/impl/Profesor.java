package impl;

public class Profesor extends Staff {
    public Profesor(String text) {
        super();
        try {
            String[] data = text.split(" ");
            firstName = data[0];
            lasttName = data[1];
            age = Integer.parseInt(data[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            age = 1945;
            if (Integer.parseInt(e.getMessage())>1) {
                age=1945;
            } else {
                throw e;
            }

        }

    }

    @Override
    public String getRoleName() {
        return "Profesor";
    }
}