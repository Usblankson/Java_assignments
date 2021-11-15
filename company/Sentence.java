package com.company;

import java.util.*;

public class Sentence {

      public static void main(String [] args) {
          //
          Scanner input = new Scanner(System.in);
          //Creating a List of Words for Subject using ArrayList
          List<String> subject=new ArrayList<String>();

          //Creating a List of Words for Predicate using ArrayList
          List<String> predicate=new ArrayList<String>();

          //Adding subjects into the first List
          subject.add("Blankson"); subject.add("Gibson"); subject.add("Jane"); subject.add("Mary");
          subject.add("Ada");   subject.add("Samuel");    subject.add("Julius");  subject.add("Joy");
          subject.add("John");  subject.add("Emmanuel");  subject.add("Richard"); subject.add("Lydia");
          subject.add("Peter"); subject.add("Gift"); subject.add("Ben");      subject.add("Bernice");
          subject.add("Sarah"); subject.add("Jerry"); subject.add("Blessing"); subject.add("Peace");

          //Adding predicates into the Second list
          predicate.add("Codes");
          predicate.add("Walked");
          predicate.add("Talked");
          predicate.add("Clapped");



          System.out.println("Enter a Subject: ");
          String subjectTest = input.nextLine();

          if(subject.contains(subjectTest)) {
              System.out.println("Enter the predicate for the Subject: ");

              String predicateTest = input.nextLine();

                if(predicate.contains(predicateTest)) {

                    String sentence = subjectTest + " " + predicateTest;

                    System.out.println("Sentence = " + sentence);
                } else{
                    System.out.println("Error: The Predicate is not available in the ArrayList");
                    System.out.println("Available predicates are: ");
                    for(String queue:predicate)
                        System.out.println(queue);

                    System.out.println("\nLet's try again");
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    Thread t = new Thread() {
                        public void run() {
                            String[] args = { };
                            Sentence.main(args);
                        }
                    };
                    t.start();
                }
          }else{
              System.out.println("Error: The Subject is not available in the ArrayList");
              System.out.println("Available Subjects are: ");
              for(String queue:subject)
                  System.out.println(queue);


              System.out.println("\nLet's try again");
              System.out.print("\033[H\033[2J");
              System.out.flush();

              Thread t = new Thread() {
                  public void run() {
                       String[] args = { };
                       Sentence.main(args);
                  }
              };
              t.start();


       }

      }
}
