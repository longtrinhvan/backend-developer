package com.webservice.java.oop.abstraction;


/**
 * interce là 1 khuôn mẫu trừu tượng 100%
 * biến trong interface là public static final và phải có trước giá trị
 */
interface X {
    /**
     * biến trong interface luôn là public static final
     */
    int x = 0;

    void number();
}

class Y implements X {
    @Override
    public void number() {
        System.out.println("THONG BAO");
    }

    int number = 10;
}
//////////////////////////////////////////////////////////////////////////////////

/***
 * Đa kế thừa trong trong java bằng interface
 */
interface D {
    int number = 10;

    void number();
}

interface E {
    int number = 11;

    void number();
}

class F implements D, E {

    @Override
    public void number() {
        System.out.println(E.number);
    }
}

public class Interface {
    public static void main(String[] args) {
        Y y = new Y();
        y.number();
        System.out.println(y.number);

        X x = new Y();
        x.number();

        /**
         * Đa kế thừa
         */
        F f = new F();
        f.number();
    }
}
