public class Triangle {

  public static void drawTriangle(int N){
    int col = 0;
    int row = 0;
    int size = N;

    while (row < size){
      while (col < row){
        System.out.print('*');
        col++;
      }
      System.out.println('*');
      row++;
      col =0;
    }
  }

  public static void main(String[] args){
    drawTriangle(10);
  }
}
