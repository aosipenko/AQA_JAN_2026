package org.prog.session4;

//TODO: print only correct emails
// Correct email rules:
// - at least 3 symbols before @
// - only @ symbol
// - full domain name (must have at least one ".")

import java.sql.SQLOutput;

public class HW3 {
    public static void main(String[] args) {

        String[] emails = new String[]{
                "abcdefg@gmail.com", //+  i = 0
                "a@gmail.com", //-        i = 1
                "josh@@gmail.com", //-    i = 2
                "janegmail.com", // -     i = 3
                "pete@gmail.com", //+     i = 4
                "zoe@gmailcom", //-       i = 5
                "steve@outlook.com", //+  i = 6
                "abcd@a.a", //+           i = 7
                "abcd.a@fakemail" //-     i = 8
        };

        for (int i = 0; i < emails.length; i++) {

            if (emails[i].indexOf("@") >= 3 && emails[i].indexOf("@") == emails[i].lastIndexOf("@") && emails[i].indexOf(".") == emails[i].lastIndexOf(".") && emails[i].indexOf(".") > emails[i].indexOf("@")) {

                System.out.println(emails[i]);
            } else {
                System.out.println("False");

            }
        }
    }
}
