package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Compiler {
    private static void pred(String subjectTest) {
        Scanner Sc = new Scanner(System.in);

        // Creating a List for Predicate
        List<String> predicate = new ArrayList<>();
        // Adding items into the predicate List
        predicate.add("Codes");
        predicate.add("Browsed");
        predicate.add("Compiled");
        predicate.add("Slipped");
        predicate.add("Walked");
        predicate.add("Sings");
        predicate.add("Dough");
        predicate.add("Slipped");
        predicate.add("Talked");
        predicate.add("Slept");
        predicate.add("Came");
        predicate.add("Cooked");
        predicate.add("Clapped");
        predicate.add("Wept");
        predicate.add("Coughed");
        predicate.add("bond");
        predicate.add("Accessed");
        predicate.add("Booked");
        predicate.add("Ran");
        predicate.add("Sucks");
        predicate.add("ate");


        System.out.println("Enter a Predicate\n");
        String predicateTest = Sc.nextLine();

        if(predicate.contains(predicateTest)) {
            System.out.println("\nYou've gotten the Predicate Right! ");
            String sentence = subjectTest + " " +  predicateTest;
            System.out.println("\nSentence formed = "+ sentence);
        }else{
            System.out.println("\nError: The Predicate is not available in the ArrayList");
            System.out.println("Please Try Again:");
            System.out.println("Available Subjects are: ");
            for (String queue : predicate)
                System.out.println(queue);
            System.out.println(" ");
            pred(subjectTest);
        }
    }


    public  static  void main(String [] args) {

        Scanner Sc = new Scanner(System.in);


        // Creating a List for subject
        List<String> subject = new ArrayList<>();


        // Adding Subject Items into the Subject List

        subject.add("Blankson");
        subject.add("Gibson");
        subject.add("Jane");
        subject.add("Mary");
        subject.add("Ada");
        subject.add("Samuel");
        subject.add("Julius");
        subject.add("Joy");
        subject.add("John");
        subject.add("Emmanuel");
        subject.add("Richard");
        subject.add("Lydia");
        subject.add("Peter");
        subject.add("Gift");
        subject.add("Ben");
        subject.add("Bernice");
        subject.add("Sarah");
        subject.add("Jerry");
        subject.add("Blessing");
        subject.add("Peace");

        System.out.println("\n\nEnter a Subject: ");
        String subjectTest = Sc.nextLine();

        if (subject.contains(subjectTest)) {
            System.out.println("\nYou've gotten the Subject Right! \n");
             pred(subjectTest);



        } else {
            System.out.println("Error: The Subject is not available in the ArrayList");
            System.out.println("Available Subjects are: ");
            for (String queue : subject)
                System.out.println(queue);
            System.out.println(" ");

            main(args);





        }


    }




}
