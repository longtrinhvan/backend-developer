package com.webservice.java.oop.abstraction;

/**
 * abstract class là 1 lớp trừu tượng không hoàn toàn
 * abstract class có thể có phương thức abstract và non-abstract, không có thuộc tinh trừu trượng
 */
abstract class A {
    /**
     * abstract int number =10;
     * Modifier 'abstract' not allowed here
     * không có thuộc tính abstract
     */
    A(){

    }
    String notice;
    static int number;
    final int number_v2 = 10;
    static final int number_v3 = 10;
    int numver_v4 = 10;

    /**
     * Phương thức non-abstract
     */
    void number() {
        System.out.println(number);
    }

    /**
     * Phương thức abstract: có từ khóa abstract, không có body
     */
    abstract void number_v2();

    /**
     * có thể triển khai hàm main
     */
//    public static void main(String[] args) {
//
//    }
}

/**
 * Triển khai lớp trừu tượng bởi lớp con và bắt buộc triển khai phương thức của lớp abstract
 */
class B extends A {

    @Override
    void number_v2() {
        System.out.println(" TRIEN KHAI PHUONG THUC TRUU TUONG");
    }
}

public class Abstract {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.notice);
        b.number();
        b.number_v2();
    }
}
