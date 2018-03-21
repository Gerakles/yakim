package L12;

interface Interf1 {
}

interface Interf2<U> extends Interf1 {
}

class Deriv1 implements Interf1, Interf2 <Object> {
}

class Deriv2 implements Interf2 <Object> {
}

class MuClass9<T extends Interf1> {
}

class Myclass9_2<T extends Interf2 <Object>> {
}

public class Main9 {
    public static void main(String[] args) {
        MuClass9 <Interf2 <Object>> my1 = new MuClass9 <>();
        Myclass9_2 <Deriv1> my2 = new Myclass9_2 <>();
        Myclass9_2 <Deriv2> my3 = new Myclass9_2 <>();
        Myclass9_2 <Interf2 <Object>> my4 = new Myclass9_2 <>();
    }
}
