package impl;

import api.Character;

public class Person implements Character {
    protected String firstName;
    protected String lasttName;
    protected int age;

    public Person(String text) {
        String[] data = text.split( " " );
        firstName = data[0];
        lasttName = data[1];
        age = Integer.parseInt( data[2] );
    }

    public Person() {
    }

    @Override
    public String getfirstName() {
        return firstName;
    }

    @Override
    public String getlastName() {
        return lasttName;
    }

    @Override
    public int getage() {
        return age;
    }
}