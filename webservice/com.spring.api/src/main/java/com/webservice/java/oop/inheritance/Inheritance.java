package com.webservice.java.oop.inheritance;


/**
 * Kế thừa là kỹ thuật xây dựng một lớp con kế thừa thuộc tính và hành vi của lớp cha mà không cần phải viết lại thông qua
 * từ khóa extends
 * Trong java không có đa kế thừa class, chỉ có đa kế thừa thông qua interface,để tránh trường hợp lưỡng nghĩa
 * Có 3 loại kế thừa:
 * - Đơn kế thừa
 * - Kế thừa nhiều cấp
 * - Kế thừa thứ bậc
 */

/**
 * Đơn kế thừa
 */
class A {
    private int number;

    private void number() {

    }
}

class B extends A {
    public String notice;
}

/**
 * kế thừa nhiều cấp
 */

class C {
    int number;

}

class D extends C {
    String notice;

}

class E extends D {
    int number() {
        return number;
    }
}

/**
 * Kế thừa thứ bậc: một class cha(superclass được kế thừa bởi nhiều class con(subclass)
 */
class X {
    int number;
}

class Y extends X {
    String notice;
}

class Z extends X {
    void notice() {

    }
}

public class Inheritance {
    public static void main(String[] args) {
        /**
         * b.number compile error: lớp con không kế thừa thuộc tính và hành vi khai báo private
         * B kế thừa A là kế thừa đơn
         */
        B b = new B();
        b.notice = "THONG BAO";

        /**
         * Kế thừa nhiều cấp
         */
        E e = new E();
        e.number();
        e.notice = "THONG BAO";
        e.number = 10;

        /**
         * Kế thừa thứ bậc
         * z kế thừa x
         * y kế thừa x
         */
        Z z = new Z();
        z.number = 10;
        z.notice();
        Y y = new Y();
        y.notice = "THONG BAO";
        y.number = 10;
    }
}
