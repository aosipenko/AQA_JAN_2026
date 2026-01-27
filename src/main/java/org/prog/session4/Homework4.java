package org.prog.session4;

public class Homework4 {


        public static void main(String[] args) {

            String[] emails = {
                    "abcdefg@gmail.com",   // +
                    "a@gmail.com",         // -
                    "josh@@gmail.com",     // -
                    "janegmail.com",       // -
                    "pete@gmail",          // -
                    "zoe@gmail.com",       // +
                    "steve@outlook.co.uk", // +
                    "abc@a.d",             // +
                    "abcd.a@fakemail"      // -
            };

            for (String email : emails) {
                if (isCorrectEmail(email)) {
                    System.out.println(email);
                }
            }
        }

        public static boolean isCorrectEmail(String email) {


            int atIndex = email.indexOf('@');
            if (atIndex == -1 || atIndex != email.lastIndexOf('@')) {
                return false;
            }
            if (atIndex < 3) {
                return false;
            }
            String domain = email.substring(atIndex + 1);

            if (!domain.contains(".")) {
                return false;
            }
            if (domain.startsWith(".") || domain.endsWith(".")) {
                return false;
            }

            return true;
        }
    }

