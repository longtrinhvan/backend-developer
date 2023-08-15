package com.webservice.java;

/**
 * Object lớp cha của các lớp trong java
 * Mặc định khi tạo 1 class thì nó luôn luôn kế thừa lớp Object
 * Ví dụ: ClassOject kế thừa lớp java.lang.Object và ghi đè method hashCode() của lớp java.lang.Object
 */
public class ClassObject {

    Object ob = new Object();

    /**
     * Ghi đè method của java.lang.Object
     */
    @Override
    public int hashCode() {
        return 1;
    }
}
