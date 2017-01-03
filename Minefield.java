import java.lang.Boolean;
public class Minefield{
  public boolean[][] bombs; //marks where bombs are 
  private String[][] field; //serves as the playing field
  public int[][] bombCount; //an int array with bomb nums to save time on computations
  public boolean won=true;
  public int RowL;
  public int ColL;
  public Minefield(int m, int n, double p){
    System.out.println("Minefield constructer initiliazed");
    int RowL = m;
    int ColL = n;
    bombs = new boolean[m+2][n+2];
    for (int a = 1; a<=m;a++){
      for (int b =1;b<=n;b++){
       bombs[a][b] = (Math.random() < p);
      }
    }
    System.out.println("Boolean[][] bombs initialized.");
    field = new String[m+2][n+2];
    for (int i=1;i<=m;i++){
      for (int j=1;j<=n;j++){
        field[i][j]=".";
        System.out.print(field[i][j]);
      }
      System.out.println();
    }
    System.out.println("Field initlaized");
     bombCount = new int[m+2][n+2];
    //# bombs adjacent to cell (i, j)
    for (int i=1;i<=m;i++){
      for (int j=1;j<=n;j++){
// (ii, jj) indexes neighboring cells AKA Magic!
        for (int ii =i-1;ii<=i+1;ii++){//basically checks left or right
          for (int jj =j-1;jj<=j+1;jj++){ //up or down
            if (bombs[ii][jj]){
              bombCount[i][j]++;
          }
        }}
      }}
    System.out.println("bombCount Iniitlaized");
    PrintLoop(bombCount);
    PrintLoop(field);
    PrintLoop(bombs);
  }
/*
  public void PrintGame(){
    for (int i=1;i<=RowL;i++){
      for (int j=1;j<=ColL;j++){
        System.out.print(field[i][j]);
 //       System.out.print("Test" + i + j);
      }
      System.out.println();
    }
  }
 \ \ \ \ \ \ \ \ \ \ \\ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \\ \ \ \ \ \ \ 
\ KEEP FOR EDITING PURPOSES PLEASE REMEMBER TO DELETE BEFORE FINISHED! \ \ \ \ \ \
 \ \ \\ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \\ \ \  \\ \ \ \ \ 
 public void PrintEndGame(){
    System.out.println("PrintEndGame initialized");
    for (int i=1;i<=RowL;i++) {
      for (int j=1;j<=ColL;j++) {
        if (bombs[i][j]){
          System.out.print("* ");}
        else{
          System.out.print(bombCount[i][j] + " ");}
            }
            System.out.println();
        }
        
  public void GameCheck(int xa, int ya){
    if (bombs[xa][ya]){
      System.out.println("TRUE BOMB IS HERE");
    }
    else{
      System.out.println("TRUE BOMB IS NOT HERE");
    }
  }*/
  public void GameCheck(int xa, int ya){  
  if (bombs[xa][ya]){//if there is a bomb at (x,y)
      for (int a=1;a<=RowL;a++){
        for (int b=1;b<=ColL;b++){
          if (bombs[a][b]){
            System.out.print("* ");
          }
          else{
            System.out.print(bombCount[a][b]);
          }
        }
        System.out.println();
      }
      System.out.println("You lose!");
      won=false;
    }
    else{
      field[xa][ya]=(Integer.toString(bombCount[xa][ya]));
      PrintLoop(field);
      System.out.println("Gamecheck done.");
    } 
  }
  public void PrintLoop(boolean[][] arrayz){
    System.out.println("PrintLoop Init");
    for (int i=1;i<=arrayz.length-2;i++){
      for (int a=1;a<=arrayz.length-2;a++){
        System.out.print(arrayz[i][a]+" ");
      }
      System.out.println();
    }
  }
  public void PrintLoop(int[][] arrayz){
    System.out.println("PrintLoop Init");
    for (int i=1;i<=arrayz.length-2;i++){
      for (int a=1;a<=arrayz.length-2;a++){
        System.out.print(arrayz[i][a]+" ");
      }
      System.out.println();
    }
  }
    public void PrintLoop(String[][] arrayz){
    System.out.println("PrintLoop Init");
    for (int i=1;i<=arrayz.length-2;i++){
      for (int a=1;a<=arrayz.length-2;a++){
        System.out.print(arrayz[i][a]+" ");
      }
      System.out.println();
    }
  }
  
  }