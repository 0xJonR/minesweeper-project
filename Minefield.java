public class Minefield{
  public boolean[][] bombs; //marks where bombs are 
  public char[][] field; //serves as the playing field
  public int[][] bombCount; //an int array with bomb nums to save time on computations
  public Minefield(int n, int m, int p){
    boolean[][] bombs = new boolean[m+2][n+2];
    for (int i = 1; i <= m; i++){
      for (int j = 1; j <= n; j++){
      bombs[i][j] = (Math.random() < p); //if true : bomb  p BEING the probability between 0 and 1! sample: .2
      }
    }
    char[][] field = new char[m+2][n+2];
    for (int i=1;i<=m;i++){
      for (int j=1; i<=n; j++){
        char[i][j]='';
      }
    }
    int[][] bombCount = new int[m+2][n+2];
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
  }
  public void PrintGame(){
    for (int i=1;i<=m;i++){
      for (int j=1;j<=n;j++){
        System.out.println(field[i][j]);
      }
    }
  }
  
