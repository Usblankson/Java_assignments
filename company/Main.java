package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int score;

        char grade;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Score");
        score = input.nextInt();

        if (score >= 70 && score <=100){
            grade = 'A';
            System.out.println(grade);
        }else if(score >= 60 && score <70){
            grade = 'B';
            System.out.println(grade);
        }else if(score >= 50 && score < 60){
            grade ='C';
            System.out.println(grade);
        }else if(score >= 45 && score < 50){
            grade ='D';
            System.out.println(grade);
        }else if(score >= 40 && score < 45){
            grade = 'E';
            System.out.println(grade);
        }else if(score < 40){
            grade = 'F';
            System.out.println(grade);
        }else{
            System.out.println("Invalid Score");
        }

    }
}
