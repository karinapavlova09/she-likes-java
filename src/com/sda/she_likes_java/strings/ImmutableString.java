package com.sda.she_likes_java.strings;

public class ImmutableString {

    public static void main(String[] args) {
        String name = "Karina";
        name = name.concat("Pavlova"); // + is shortcut for concat method call
        name = name.concat("she's 25");
        System.out.println("My name now: " + name);

        StringBuilder nameWithBuilder = new StringBuilder("Karina");
        nameWithBuilder.append(" Pavlova");
        nameWithBuilder.append(" Pavlova");
        nameWithBuilder.append(" Pavlova");
        nameWithBuilder.append(" Pavlova");
        nameWithBuilder.append(" Pavlova");
        nameWithBuilder.append(" Pavlova");
        System.out.println("Name with builder: " + nameWithBuilder);

        String some = "Alice " + " is" + " 10" + " years";
        // "Alice is" + " 10" + " years"
        // "Alice is 10" + years"
        // Alice is 10 years
        String alice = "Alice ";
        StringBuilder someString = new StringBuilder();
        someString.append("Alice");
        someString.append("is");
        someString.append("10");
        someString.append("years");
    }
}
