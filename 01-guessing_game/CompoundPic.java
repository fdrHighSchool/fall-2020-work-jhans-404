public class CompoundPic{
  public static void main(String[] args) {

    for (int i = 1; i < 5; i++){
      makeSquare(i);
    }
    
  }//end main method

  public static void makeSquare(int squares){
    for (int row = 0; row < squares; row++){
      for (int col = 0; col < squares; col++){
        System.out.print("* ");
      }//end inner for loop
      System.out.println();
    }//end outer for loop
  }//end makeSquare method

}//end class
