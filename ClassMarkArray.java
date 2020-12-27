public class ClassMarksArray {

  public static int classAverage(int[][] marksArray) {
    
    //Declare variables
    int total = 0;
    //int totalNum = 0;
    int counter = 0;

    for (int x = 0; x < marksArray.length; x++) {
      //counter is for the student #
      counter = counter + 1;
      System.out.printf("Student " + counter + " marks   :  ", Integer.toString(x + 1));
      for (int y = 0; y < marksArray[0].length; y++) {
        //Randomly picks a number for the array from 1 to 100
        marksArray[x][y] = (int)(Math.random() * 100 + 1);
        if (y < marksArray[x].length - 1) {
          System.out.println(marksArray[x][y] + ",  ");
        } else {
          System.out.printf("%s%n", marksArray[x][y]);
        }
        total = total + marksArray[x][y];
        //System.out.println("total: " + total);
      }
    }
    //Calculate the average
    int average = total / (marksArray.length * marksArray[0].length);
    return average;
  }

  
    public static void main(String[] args) {
  
