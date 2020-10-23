//ritchy and hans

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // greet the user of your with a certain
    // amount of base coins to their bank (can be random or fixed)
    int coins = 10;


    // create a looping structure that allows the user to play
    // A) a fixed number of rounds
    // OR
    // B) until they choose to quit
    // (this is prefereable, but we didn't review this type of loop yet)
    // for loop, while loop
    int answer = 1;
    while (answer != 0){
    /// menu of options that asks the user what they want to do:
    // 1. play
    // 2. shop
    // 3. quit
    // (feel free to add more options to this if you're inspired)
    System.out.println("You currently have " + coins + " coins.");
    System.out.println("What would you like to do?");
    System.out.print("0. Quit\n1. Play \n2. Shop\n");
    answer = input.nextInt();

    if (answer == 1){
      coins = play(coins);
    }//end if

    if (answer == 2){
      shop(coins);
    }

    }//end while loop



    // based on their entry, call the method to perform that behavior
    // at all times, keep updating the user's bank balance


  }//end main method


  /*
   * Name: play
   * Purpose: simulate a round of the game, award the user a random amount of coins for playing
   * Input: ???
   * Return: a random number of coins the user won that round
   */
   public static int play(int c){
     //Math.random() * (max - min + 1) + min
     int coinsWon = (int)(Math.random() * (10 - 5 + 1) + 5);
     System.out.println("Good race...you won " + coinsWon + " coins");
     System.out.println();

     return c + coinsWon;

   }//end play method

  /*
   * Name: shop
   * Purpose: allow the player to spend coins
   * Input: amount of coins user currently has
   * Return: how many coins spent/updated balance
   */
  public static String shop(int c){
    System.out.println("Welcome to the Shop!");
    System.out.println("Item:\tCost:");
    String item[][] = new String [3][4];

    return " ";
  }//end shop method
}//end class
