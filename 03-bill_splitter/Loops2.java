public class Loops2{
  public static void main(String[] args) {

    partA();
    //partD();
    //partE();

  }//end main method

  public static void partA(){
    /*
    for (int i = 0; i < 5; i++){
      System.out.println("* * * * *");
    }//end for loop
    */

    System.out.println();

    for (int row = 0; row < 4; row++){
      for(int rep = 0; rep <= row; rep++){
        for (int col = 0; col <= row; col++){
          System.out.print("* ");
        }//end inner for loop
        System.out.println();
      }//end rep for loop
    }//end outer for loop

  }//end partA method

  /*
    1 1 1 1 1 1
    2 2 2 2 2 2
    3 3 3 3 3 3
   */
  public static void partD(){

    for (int row = 1; row <= 3; row++){
      for (int i = 0; i < 6; i++){
        System.out.print(row + " ");
      }//end for loop (i)
      System.out.println();
    }//end for loop(row)
  }//end partD

  /*
        1
       22
      333
     4444
    55555
   */
  public static void partE(){
    for (int row = 5; row > 0; row--){

      //control the amount of blanks on each row
      for (int blanks = 1; blanks < row; blanks++){
        System.out.print(" ");
      }//end for loop(blanks)

      //control how many times to print a number on each row
      for (int num = 0; num < 6 - row; num++){
        //determine which number to print on each row (based on the row number)
        System.out.print(6 - row);

      }//end for loop(num)
      System.out.println();
    }//end for loop(row)
  }//end partE

}//end class
