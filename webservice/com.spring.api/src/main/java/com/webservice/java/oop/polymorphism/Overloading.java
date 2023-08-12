package com.webservice.java.oop.polymorphism;

/**
 * Đa hình lúc biên dịch
 * Thay đổi hành vi theo điều kiện ( theo param) - dựa vào class cũng có thể xác định được sự thay đổi hành vi dối tượng
 */


/**
 * Class có thể ghi đè phương thức nạp chồng của class Overloading thông qua việc kế thừa class Overloading
 */
class X extends Overloading{
    @Override
    void notice( int a) {

    }
}

public class Overloading {

    /**
     * Nạp chồng không thay đổi giá trị trả về
     */
    void notice() {

    }

    void notice(int a) {

    }

    void notice(int a, int b) {

    }

    /**
     * Nạp chồng thay đổi giá trị trả về - băng cách thay đổi param
     */
    int notice(int a, int b, int c) {
        return 10;
    }

    String notice(int a, int b, int c, int d) {
        return "";
    }
}

