import java.util.Scanner;
public class Minesweeper{
  public static void main(String[] args){
    Scanner x = new Scanner(System.in);
    System.out.println("First value will correspond to amount of rows, and second for columns.");
    int XA = x.nextInt(); //10 default
    int YA = x.nextInt(); //10 default
    System.out.println("Select percentage of bombs. 50% is 0.5.");
    double P = x.nextDouble(); //.5 default
    /* ////////////////// Jonathan Rodriguez
     * // .25 = easy  //
     * // .50 = med   //
     * // .75 = hard  //
     * // 10x10 = ez  // 
     * // 20x20 = med // 
     * // 50x50 =KILL //
     * /////////////////
     */
    System.out.println();
    Minefield Tra = new Minefield(XA, YA, P);
    System.out.println("Game board:");
    Tra.PrintLoop(Tra.field);
    while (Tra.won){
     System.out.println("Provide X and Y coordinates:");
      int tempX = x.nextInt();
      int tempY = x.nextInt();
      Tra.GameCheck(tempX, tempY);
    } 
    return;
    }
  }
