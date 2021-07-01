package com.company;


public class duplicateOne {

    public static void main(String[] args) {

        String[] names = {"java", "javascript", "ruby", "c", "python", "java"};

        // compare each element
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j]))
                    System.out.println("Duplicate element is :" + names[i]);       //print repeated one

            }
        }
    }

}

