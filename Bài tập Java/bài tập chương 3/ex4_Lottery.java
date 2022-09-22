package com.mycompany.java1;
import java.util.Scanner;

public class Java1 {

     public static void LOTTE(int guess_param){

        int lottery = (int)(Math.random()*100);
        int lottery_result1 = lottery/10;
        int lottery_result2 = lottery%10;
        int guess_1 = guess_param/10;
        int guess_2 = guess_param%10;

        String lottery_money10 = "chuc mung ban da trung 10,000 dolla";
        String lottery_money3 = "chuc mung ban da trung 3000 dolla";
        String lottery_money1 = "chuc mung ban da trung 1000 dolla";
        String lucky_ago = "chuc may man lan sau !!!";

        System.out.println("ket qua xo so la : " + lottery);

        if(guess_param == lottery){
             System.out.print(lottery_money10);
        }
        else if(guess_2 == lottery_result1 && guess_1 == lottery_result2){
             System.out.print(lottery_money3);
        }
        else if(guess_1 == lottery_result1||guess_1 == lottery_result2||
                guess_2 == lottery_result1||guess_2 == lottery_result2){
             System.out.print(lottery_money1);
        }
        else{
             System.out.print(lucky_ago);
     }
}    

     public static void main(String[] args){
        
        int input_guess;

        Scanner input = new Scanner(System.in);
        System.out.print("nhap vao so co 2 chu so : ");

        input_guess = input.nextInt();
        LOTTE(input_guess); //callbacks
    }
}
