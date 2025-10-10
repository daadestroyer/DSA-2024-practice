import java.util.*;


interface A {
    static void m1() {
        System.out.println("static m1 of A");
    }

    default void m2() {
        System.out.println("default m2 of A");
    }
}

class Test implements A {
    public void access() {
        A.m1();
    }
}

public class App {
    public static void main(String[] args) {

        Integer i = null;
        Optional<Integer> optionalValue2 = Optional.ofNullable(i);
        System.out.println(optionalValue2); // Optional.empty




    }
}
