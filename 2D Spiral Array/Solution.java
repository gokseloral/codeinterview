/*
 * Click `Run` to execute the snippet below!
 */
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String args[]){
     Scanner scanner = new Scanner(System.in);
        
      // Prompt user for input
      System.out.print("Enter a number: ");
      int num = scanner.nextInt();
      scanner.close();
      
      // Create and populate array
      int[][] array = spiral(num);
      for (int i = 0; i < num; i++) {
          System.out.println(Arrays.toString(array[i]));
      }
  }

  private static int[][] spiral(int N){
     if (N<=0) {
      throw new IllegalArgumentException("N must be >0");
    }
    int[][] spiralArray = new int[N][N];
    int [] pattern = new int[2*N-1];
    for(int i=N,j=0;i>0&j<pattern.length;j++){
      i = i-j%2;
      pattern[j] = i;
    } 

    int x=0,y=0,iteration = 0;
    for(int i=0;i<pattern.length;i++){
      int direction = i%4;
      for(int j=0;j<pattern[i];j++,iteration++){  
        spiralArray[x][y] = iteration;
        if(j == pattern[i]-1){
          direction = (i+1)%4;
        }   
        switch(direction){
              case 0: y++; break; // RIGHT
              case 1: x++; break; // DOWN
              case 2: y--; break; // LEFT
              case 3: x--; break; // UP
              default:  break;
        }     
      }      
    }

    return spiralArray;
  }
}
