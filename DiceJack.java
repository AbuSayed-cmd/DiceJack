package DiceJack;

import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        System.out.println("Enter three number betwen 1 to 6 "); 
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if(num1<1 || num2<1 || num3<1){
            System.out.println("Number's can not be less than 1");
            System.exit(0);
        }

        if(num1>6 || num2>6 || num3>6){
            System.out.println("Number's can not be Greater than 6");
            System.exit(0);
        }

        int sumOfNumbers = num1 + num2 + num3;
        int sumofDiceRolls = roll1 + roll2 + roll3;

        System.out.println("Dice sum = " + sumOfNumbers + " and Sum of DiceRolls is " +sumofDiceRolls);
        winer(sumOfNumbers, sumofDiceRolls);
        scan.close();
    }
    

    public static int rollDice(){
        double randomNumber = Math.random() * 6; // random() function generated number between 0 to 0.99
        randomNumber +=1;
        return (int)randomNumber; // type cast
    }

    public static void winer(int sumOfNumbers, int sumofDiceRolls){
        if((sumOfNumbers > sumofDiceRolls) && (sumOfNumbers-sumofDiceRolls>3)){
            System.out.println("Congrates, You Won!");
        }else{
            System.out.println("Sorry! you lost.");
        }
    }
}
