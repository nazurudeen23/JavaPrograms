package com.company;

public class sum{
    public static int sums(String str){
        StringBuilder temp= new StringBuilder();
        int sum=0;

        for (int i = 0; i < str.length();i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch))

                temp.append(ch);

            else {

                sum += Integer.parseInt(temp.toString());


                temp = new StringBuilder("0");

            }

        }

        return sum + Integer.parseInt(temp.toString());

    }

    public static void main(String[] args)

    {

        String str = "12fgty103gh23";
        System.out.println(sums(str));

    }
}