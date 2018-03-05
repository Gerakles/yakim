package impl;

import api.Role;
import impl.Person;

public abstract class Staff extends Person implements Role {

    public Staff(String text) {
        super(text);
    }

    public Staff() {

    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Role=")
                .append(getRoleName())
                .append(", {")
                .append(getfirstName())
                .append(", ")
                .append(getlastName())
                .append(", ")
                .append(getage()==1945?"":getage())
                .append("}");
        return sb.toString();
    }


}