import java.util.Scanner;
public class Minesweeper{
  public static void main(String[] args){
    Scanner x = new Scanner(System.in);
    int XA = x.nextInt(); //10 default
    int YA = x.nextInt(); //10 default
    double P = x.nextDouble(); //.5 default
    /* ////////////////// Jonathan Rodriguez
     * // .25 = easy  //
     * // .50 = med   //
     * // .75 = hard  //
     * // 10x10 = ez  // 
     * // 20x20 = med // 
     * // 50x50 =hard //
     * /////////////////
     */
    System.out.println();
    Minefield Tra = new Minefield(XA, YA, P);
    while (Tra.won){
     System.out.println("Provide X and Y coordinates:");
      int tempX = x.nextInt();
      int tempY = x.nextInt();
      Tra.GameCheck(tempX, tempY);
    } 
    return;
    }
  }
