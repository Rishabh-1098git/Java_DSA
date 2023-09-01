package com.Rishabh;

public class _09_String_Methods {
    public static void main(String[] args) {

        String name = "Rishabh";
        String name1 = "  Rishabh  ";

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name1.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,6));
        System.out.println(name.replace('R','H'));
        System.out.println(name.startsWith("Ri"));
        System.out.println(name.endsWith("bh"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("b"));
        System.out.println(name.equals("Rishabh"));
        System.out.println(name.equalsIgnoreCase("rishabh"));

    }
}

