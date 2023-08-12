package com.webservice.java.collection;

import java.util.*;

public class InterfaceList {
    public static void main(String[] args) {
        /**
         * Có 3 cách triển khai 1 danh sách là
         */
        /**
         * mảng động ArrayList:
         * - kích thước mảng có thể tự dộngd tăng - tăng 50% kích thước mặc định
         * - kích thước mặc định là kích thước mảng - size là số phần tử trong mảng
         * - các phần tử xắp xếp liền nhau
         * - các phần tử có thể trùng lặp
         * - thứ tự được duy trì
         * - vì sắp xếp liền nhau nên thêm, xóa bị chậm: mảng động cho phép tạo bảng nền lưu trữ và copy các phần tử
         * để dịch chuyển, thao tác này làm chậm
         * - update ko ảnh hưởng tới hiệu suất
         * - cho phép truy cập ngẫu nhiên theo index
         * - arraylist không hỗ trợ đồng bộ -khác với vector
         */
        List<String> l1 = new ArrayList<>();
        l1.get(1);
        Iterator<String> iterator1 = l1.iterator();
        /**
         * LinkedList là danh sách liên kết đôi
         */
        List<String> l2 = new LinkedList<>();
        /**
         * cho phép lấy theo index, nhưng phải duyệt lại từ đầu danh sách để tính index nên chậm
         */
        l2.get(1);
        Iterator<String> iterator2 = l2.iterator();

        /**
         * Vector là một danh sách động có hỗ trợ đồng bộ
         * có các tính chất của arraylist nhưng thêm sync( đồng bộ) nên việc thêm, sửa, xóa chậm trong môi trường đơn luồng
         */
        List<String> l3 = new Vector<>();
        Iterator<String> iterator3 = l3.iterator();

        /**
         * Stack là 1 ngăn xếp không phải là 1 danh sách, Stack được mở rộng từ vertor
         */
        List<String> l4 = new Stack<>();
        Iterator<String> iterator4 = l4.iterator();
    }
}
