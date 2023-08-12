package com.webservice.java.collection;

import java.util.*;

public class InterfaceSet {
    Date activedDate = new Date();
    String notice =" THONG BAO";

    public static void main(String[] args) {
        InterfaceSet set = new InterfaceSet();
        System.identityHashCode(set);
        var a = set.notice.hashCode();
        var b = set.activedDate.hashCode();
        var c = set.hashCode();
        var d = set.hashCode() - set.activedDate.hashCode();
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new LinkedHashSet<>();
        Set<String> s3 = new TreeSet<>();
    }
}
