package com.webservice.java.variable;

/**
 * Có 3 loại biến:
 * _ Biến local - lưu trong bộ nhớ stack
 * - Biến instance - biến instance thuộc về đối tượng cụ thể, đối tượng lưu trong bộ nhớ heap và biến instane
 * được lưu theo đối tượng trong bộ nhớ heap
 * - Biến static lưu trong bộ nhớ static
 */
class VariableStatic {
    static int number = 1;
}

public class Variable {

    /**
     * Biến static lưu trong bộ nhớ static riêng
     * được khai báo với từ khóa static
     * Nằm bên trong class, ngoài block, contructer, method
     * Có thể sử dụng accsess modifier
     * Khởi tạo khi ứng dụng chạy và hủy khi dừng ứng dụng
     * Chỉ có 1 bản duy nhất
     */
    static int number = 1;

    /**
     * Biến static có thể truy cập trực tiếp thông qua tên class
     */
    void getNumber() {
        var a = VariableStatic.number;
        var b = number;
        int c;
    }

    /**
     * Biến instance lưu trong bộ nhớ heap, lưu cùng với đối tượng chứa nó
     * Có thể sử dụng accsess modifier
     * Được sử dụng bở các contructor, method, block thông qua 1 đối tượng cụ thể
     * Có thể gọi trực tiếp bằng tên trong class hoặc thông qua từ khóa this
     * Bị phá hủy khi đối tượng bi phá hủy
     */
    String notice = "NO";

    void notice() {
        number = 10;
    }

    /**
     * Biến local lưu trong bộ nhớ stack
     * Nằm bên trong contructor, block, method
     * Biến tạo sau hủy trước
     * Vòng đời bắt đầu khi gọi contructor, block, method và kết thúc khi contructor, block, method kết thúc
     * không dùng accsess modifier
     */
    void number() {
        var a = VariableStatic.number;
        var b = number;
        int c;
    }

    public static void main(String[] args) {

    }
}