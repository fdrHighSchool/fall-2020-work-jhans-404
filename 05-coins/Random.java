public class Random{
  public static void main(String[] args) {

    int randomNum = (int)(Math.random() * (9 - 1 + 1) + 1);

    //still left: 1, 7
    while (randomNum % 2 == 0 || randomNum == 3 || randomNum == 5){
      randomNum = (int)(Math.random() * (9 - 1 + 1) + 1);
    }//end if statement

    System.out.println(randomNum);
  }//end main method

}//end class
