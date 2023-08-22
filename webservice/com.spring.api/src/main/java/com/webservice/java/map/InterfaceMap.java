package com.webservice.java.map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Stream;

/**
 * <a href="https://medium.com/@basecs101/internal-working-of-hashmap-in-java-latest-updated-4c2708f76d2c">...</a>
 * Map không phải là 1 colection
 * Map là lưu trữ dạng key/value
 */

public class InterfaceMap {
    public static void main(String[] args) {

        HashMap<Integer, String> m = new HashMap<>();
        m.put(4, "YES");
        m.put(2, "NO");
        m.put(3, "NO");
        m.put(1, "NO");

        Set<Map.Entry<Integer, String>> entrySet = m.entrySet();
        /**
         * entrySet.add({1,"NO"}); error
         * entrySet là chỉ read only set - chỉ để đọc
         */
        for (Map.Entry<Integer, String> x : entrySet) {
            System.out.println(x.getKey() + "-------" + x.getValue());
        }

        Stream<Map.Entry<Integer, String>> entryStream = m.entrySet()
                .stream()
                .sorted(Comparator.comparing(x -> x.getKey()));

        for (Map.Entry<Integer, String> x : entrySet) {
            System.out.println(x.getKey() + "-------" + x.getValue());
        }

        LinkedHashMap<Integer, String> m3 = new LinkedHashMap<>();
        m3.put(1, "NO");
        m3.put(2, "NO");
        m3.put(3, "NO");
        Set<Map.Entry<Integer, String>> entrySet2 = m3.entrySet();


        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(1, "a");
        tree.put(1000000000, "a");
        tree.put(1000001000, "a");
        tree.put(3333, "a");
        for (Map.Entry<Integer, String> entry : tree.entrySet()) {
            System.out.println(entry.getKey() + "-------" + entry.getValue());
        }
        /**
         * 1----------------a
         * 3333-------------a
         * 1000000000-------a
         * 1000001000-------a
         *TreeNode root = new TreeNode(10);
         *root.left = new TreeNode(5);
         *root.right = new TreeNode(15);
         *root.left.right = new TreeNode(9);
         *root.right.left = new TreeNode(11);
         */

        ConcurrentHashMap<Integer,Integer> a = new ConcurrentHashMap<>();
        a.put(1,1);
    }
}
