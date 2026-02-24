package org.prog.session4;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Home3 {
    public static void main(String[] args) {
        List<String> emails = List.of(
                "abcdefg@gmail.com", //+
                "a@gmail.com", //-
                "josh@@gmail.com", //-
                "janegmail.com", // -
                "pete@gmail.com", //+
                "zoe@gmailcom", //-
                "steve@outlook.com", //+
                "abcd@a.a", //+
                "abcd.a@fakemail" //-

        );
        List<String> correctEmails = filterCorrectEmails(emails);

        System.out.println("// TODO: print only correct emails");
        for (String email : correctEmails) {
            System.out.println(email);
        }
    }



    public static List<String> filterCorrectEmails(List<String> emails) {
        List<String> correctEmails = new ArrayList<>();


        String regex = "^[\\w.-]{3,}@[\\w-]+\\.[\\w-]+$";
        Pattern pattern = Pattern.compile(regex);

        for (String email : emails) {
            if (pattern.matcher(email).matches()) {
                correctEmails.add(email);
            }
        }

        return correctEmails;
    }
}

