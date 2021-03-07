package com.heima.ArrayList;
import java.util.ArrayList;

public class demoarraylist{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abd");
        boolean a = list.remove("abc");
        boolean b = list.remove("add");
        System.out.println(a);
        System.out.println(b);
        System.out.println(list);

    }

}

