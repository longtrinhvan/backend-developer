package com.webservice.java.oop.encapsulation;

import com.google.common.base.Strings;

import java.util.Date;

/**
 * Đóng gói là kỹ thuật để che giấu thông tin và triển khai hành vi của đối tượng, đồng thời cung cấp giao diện để tương tắc đối với tượng đó
 * Khác với trừ tượng ở chỗ : mục đích và đối tượng hướng tới
 * - ĐÓNG GÓI: quyết định phạm vi (giới hạn/ bảo vệ có chọn lọc) dữ liệu và hành vi - từ đó tạo mối liên kết giữa thuộc tính và phương thức
 * - TRỪU TƯỢNG: ẩn đi chi tiết/ các logic/ các triển khai phức tạp trong code
 */

/**
 * Access modifỉer trong đóng gói: giới hạn phạm vi truy cập đến dữ liệu, phương thức, contructer, lớp.
 * default: Truy cập nội bộ package
 * private: Truy cập nội bộ class
 * protected: Truy cập nội bộ trong package và bên ngoài package bởi lớp con
 * public: Công khai, không giới hạn quyền truy cập
 */
public class Encapsulation {
    /**
     * Bảo vệ dữ liệu gốc quan trọng của thuộc tính token và timer (1)
     */
    private String token;
    private Date timer;

    private String getToken() {
        return token;
    }

    private Date getTimer() {
        return timer;
    }

    /**
     * Hiển thị những thông tin và chức năng đủ cho mục đích sử dụng đối tượng (2)
     */
    public String fullName;

    public boolean checkToken() {
        var now = new Date();
        return Strings.isNullOrEmpty(token) && now.getTime() - timer.getTime() < 150000L ? true : false;
    }

    /**
     * Với 2 cách thể hiện (1) và (2) cho thấy các nhóm dữ liệu và các hành vi  được tách biệt theo mục đích sử dụng.
     * Hình thành nên phạm vi và mối liên hệ với nhau
     */

    ////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * timer, token, getToken, getTimer giới hạn trong phạm vi class: phục vụ cho vận hành ứng dụng
     * fullName, checkToken được công khai: phục vụ cho mục đích hiển thị cho người dụng
     */
    public static void main(String[] args) throws InterruptedException {

        Encapsulation en = new Encapsulation();
        en.timer = new Date();
        en.token = "REUWORHJBGDKFSFDHJDF2323DSFDSFDSFTRTERTDSF1323123GSDFKDFJGDSFK";
        Thread.sleep(1000000L);
        en.checkToken();

    }
}
