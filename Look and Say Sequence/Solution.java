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
      System.out.print("Enter list of sequence ");
      int num = scanner.nextInt();
      scanner.close();
      
      lookAndSaySequence(num);
      
  }

  private static void lookAndSaySequence(int N){
     if (N<=0) {
      throw new IllegalArgumentException("N must be >0");
    }
    
    String resultStr = "1";

    for(int i=0;i<N;i++){ // loop sequence
      StringBuffer buf = new StringBuffer();
      System.out.println(resultStr);
      int times = 1;
      char currentChar = resultStr.charAt(0);
      for(int j=0;j<resultStr.length();j++){ // loop from last result
        currentChar = resultStr.charAt(j);
        
        if(j == resultStr.length()-1 || currentChar != resultStr.charAt(j+1)){ // if different then previous add
          buf.append(times).append(String.valueOf(currentChar));
          times = 1;
        }else{ // 
          times++;
        }        
      }
      if(buf.isEmpty())
        buf.append(times).append(String.valueOf(currentChar));
          
      resultStr = buf.toString();
    }
  }
}
