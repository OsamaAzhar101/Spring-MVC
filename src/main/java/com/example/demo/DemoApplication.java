package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    public static boolean TestPalindrome(String palindrome) {
        int i = 0;
        int total = palindrome.length();
        while (i < palindrome.length() / 2) {


            if (!(palindrome.split("")[i]).equals(palindrome.split("")[total - 1])) {

                return false;

            }
            i++;
            total--;
        }


        return true;


    }

}