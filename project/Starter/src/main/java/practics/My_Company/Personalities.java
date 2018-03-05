package practics.My_Company;

public class Personalities implements Identifity {
    protected int id;
    protected int age;
    protected String firstName;
    protected String lastName;

    public Personalities(String text) {
        String[] ordin = text.split( " " );
        id = Integer.parseInt( ordin[0] );
        firstName = ordin[1];
        lastName = ordin[2];
        age = Integer.parseInt( ordin[3] );
    }

    public Personalities() {
    }

    @Override
    public int ID() {
        return id;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getSecondName() {
        return lastName;
    }
}
