package com.company;

import java.util.*;

public class mapSort {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap = new HashMap<>();
        // add elements
        hmap.put(104, "golang");
        hmap.put(102, "python");
        hmap.put(103, "javascript");
        hmap.put(101, "java");
        hmap.put(202, "ruby");
        hmap.put(12, "typescript");

        List<Map.Entry<Integer,String>> list = new ArrayList<>(hmap.entrySet());
        list.sort(Map.Entry.comparingByKey());
        for(Map.Entry<Integer, String> o:list) {
            System.out.println(o.getValue()+ " : "+o.getKey());
        }
    }
}
