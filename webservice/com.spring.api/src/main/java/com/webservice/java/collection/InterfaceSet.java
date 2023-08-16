package com.webservice.java.collection;

import java.util.*;

public class InterfaceSet extends RuntimeException {
    InterfaceSet() {

    }

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
        for (String s : s1) {
            System.out.println(s);
        }

        LinkedHashSet<String> s2 = new LinkedHashSet<>();
        s2.add("1");

        TreeSet<String> s3 = new TreeSet<>();
        s3.add("3");
        s3.add("2");
        s3.add("4");
        s3.add("1");
        for (String s : s3) {
            System.out.println(s);
        }

        Set<days> e = EnumSet.of(days.MONDAY, days.TUESDAY, days.WEDNESDAY);
        e.add(days.SUNDAY);
        try {

            Iterator<days> iter = e.iterator();
            while (iter.hasNext())
                System.out.println(iter.next());

        } catch (Exception ex) {
            throw new InterfaceSet();
        } finally {
            System.out.println();
        }
    }

    enum days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
}
