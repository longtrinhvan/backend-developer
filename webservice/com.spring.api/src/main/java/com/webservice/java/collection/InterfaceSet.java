package com.webservice.java.collection;

import java.util.*;

public class InterfaceSet {
    Date activedDate = new Date();
    String notice = " THONG BAO";

    public static void main(String[] args) {

        InterfaceSet set = new InterfaceSet();
        System.identityHashCode(set);
        var a = set.notice.hashCode();
        var b = set.activedDate.hashCode();
        var c = set.hashCode();
        var d = set.hashCode() - set.activedDate.hashCode();

        HashSet<String> s1 = new HashSet<>();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        for(String s : s1){
            System.out.println(s);
        }

        LinkedHashSet<String> s2 = new LinkedHashSet<>();
        s2.add("a");

        TreeSet<String> s3 = new TreeSet<>();
        s3.add("a");
    }
}
