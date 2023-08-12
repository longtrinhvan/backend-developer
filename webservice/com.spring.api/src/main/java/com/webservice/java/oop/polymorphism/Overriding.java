package com.webservice.java.oop.polymorphism;

/**
 * Đa hình là kỹ thuật thể hành vi của đối tượng theo nhiều cách khác nhau
 */

/**
 * Đa hình trong run-time
 * Thay đổi hành vi của đối tượng - lớp con phải kế thừa lớp cha( thông qua từ khóa extands)
 * <p>
 * Khi khai báo A a = new B();
 * biến tham chiếu a của lớp A đang tham chiếu tới đối tượng lớp con B và thể hiện của nó là thể hiện của lớp cha
 * nhưng nếu có phương thức ghi đè thì thể hiện sẽ thay đổi thành thể hiện lớp con( đa hình run - time)
 * - thuộc tính sẽ là lớp cha - phương thức sẽ là lớp con
 * <p>
 * Ví dụ : List<String> a = new ArrayList<>();
 * biến a mang các thương thức( method của lớp cha được ghi đè bởi lớp con)
 * Nguồn tham khào: <a href="https://gpcoder.com/2406-co-che-upcasting-va-downcasting-trong-java/">...</a>
 */
class A {
    String notice = "DAY LA THUOC TINH LOP CHA";

    void notice() {
    }
}

class B extends A {
    @Override
    void notice() {
        notice = "DAY LA THUOC TINH LOP CON B";
    }

    int number = 10;

    void downcasting() {
        System.out.println("VI DU DOWNCASTING " +
                "- THE HIEN DOI TUONG LA THE HIEN CUA LOP CHA THANH DOI TUONG THE HIEN BOI LOP CON");
    }
}

public class Overriding {
    private static void runMain() {
        /**
         * Lớp cha tham chiếu đến lớp con upcasting
         * Thuộc tính khi khởi tạo được lấy từ lớp cha
         */
        A a = new B();
        System.out.println(a.notice);
//        a.notice();
//        System.out.println(a.notice);
        /**
         * downcasting - thể hiện đối tượng a thành đối tượng là thể hiện của lớp con
         * TH này sử dụng khi cần tính toán/ hành động mà chỉ lớp con mới có
         */
        B b = (B) a;
        System.out.println(b.notice);
        b.downcasting();
        System.out.println(b.number);

    }

    public static void main(String[] args) {
        runMain();
    }
}