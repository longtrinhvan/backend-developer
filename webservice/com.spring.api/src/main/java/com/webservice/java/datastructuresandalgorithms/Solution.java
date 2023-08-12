package com.webservice.java.datastructuresandalgorithms;

public class Solution {

    /**
     Dãy số nguyên: {2, 5, 3, 8, 1}
     k = 3, t = 11
     Các tổ hợp thỏa mãn điều kiện là:
     253
     251
     231
     281
     531
     2531
     Số lần xuất hiện của các tổ hợp: 6
     Ví dụ khác:
     Dãy số nguyên: {1, 1, 2, 2}
     k = 2, t = 3
     Các tổ hợp thỏa mãn điều kiện là:
     11 (số đầu với số thứ hai)
     12 (số đầu với số thứ ba)
     12 (số đầu với số thứ tư)
     12 (số thứ hai với số thứ ba)
     12 (số thứ hai với số thứ tư)
     Số lần xuất hiện của các tổ hợp: 5
     **/
    public int solution(int[] arr, int k, int t) {
        int total = 0;
        int length = arr.length;
        for (int u = k; u < length; u++) {
            for (int s = 0; s <= length - k; s++) {
                int begin = s;
                int root = arr[s];
                int boQuaSoDaCong = k - 1 + s;
                for (int j = 0; j <= length - k; j++) {
                    int demSoBienDuocCong = 1;
                    for (int i = begin + 1; i < length; i++) {
                        if (demSoBienDuocCong >= k - 1) {
                            break;
                        }
                        root = root + arr[i];
                        demSoBienDuocCong++;
                    }
                    for (int i = boQuaSoDaCong; i < length; i++) {
                        int result = root + arr[i];
                        if (result <= t) {
                            total++;
                        }
                    }
                    if (demSoBienDuocCong == 1) {
                        break;
                    }
                    begin++;
                    boQuaSoDaCong++;
                    root = arr[s];
                }
            }
            k++;
        }
        return total;
    }

    public static void main(String[] args) {
        // đổi Integer thành int
        Integer a = 3;
        int i = a.intValue();// đổi Integer thành int
        int j = a;// unboxing, tự động đổi Integer thành int trong nội bộ trình biên dịch

        System.out.println(a + " " + i + " " + j);
    }


//    public static void main(String[] args) {
//        Solution solution = new Solution();
//
//        int[] arr = {2, 5, 3, 8, 1};
//        var total = solution.solution(arr, 3, 11);
//        System.out.println(total);
//        int[] arr2 = {1, 1, 2, 2};
//        var total2 = solution.solution(arr2, 2, 3);
//        System.out.println(total2);
//    }
}