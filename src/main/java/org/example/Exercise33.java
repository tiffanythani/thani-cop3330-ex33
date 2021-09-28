/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tiffany Thani
 */
package org.example;
import java.util.Random;
import java.util.Scanner;
public class Exercise33 {

        public static void main(String[] args) {

            String[] responses = {"No","Yes","Maybe","Ask again later"};
            Random random = new Random();
            Scanner scan = new Scanner(System.in);
            System.out.println("What's your question?");
            String question = scan.nextLine();


            int randomResponseIndex = random.nextInt(responses.length);
            String response = responses[randomResponseIndex];

            System.out.println();
            System.out.println(response);
            System.out.println();
        }
    }
