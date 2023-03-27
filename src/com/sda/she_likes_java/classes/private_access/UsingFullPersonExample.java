package com.sda.she_likes_java.classes.private_access;

import com.sda.she_likes_java.classes.constructor.FullPerson;

public class UsingFullPersonExample {
    public static void main(String[] args) {
        FullPerson maybeMe
                = new FullPerson("Karina", "P.",25, null);
        System.out.println("my Age:" + maybeMe.getAge());
        System.out.println("me before age decreasing" + maybeMe);
        maybeMe. setAge(-1);
        System.out.println("me after failed trial to decrease age" + maybeMe);
    }
}
