import java.util.*;
import java.io.*;
import java.lang.*;
 
public class Piramide {
  
   public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter writer = new PrintWriter(System.out);
    
       String line = in.readLine();   
       StringTokenizer tokenizer = new StringTokenizer(line," ");
       int N = Integer.parseInt(tokenizer.nextToken());
 
    int m[][] = new int[N+1][N+1];
    int dp[][] = new int[N+1][N+1];
    
    for ( int i = 1; i <= N; i++ ){
 	   line = in.readLine();   
 	   tokenizer = new StringTokenizer(line," ");
 	   for ( int j = 1; j <= N; j++ ){
        dp[i][j] = 0;       
        m[i][j] = Integer.parseInt(tokenizer.nextToken());
 	   }
    }
    
    for ( int i = 1; i <= N; i++ ){
 	   int base = 0;
 	   for ( int j = 1; j <= N; j++ ){
        base += m[i][j];
        if ( j > i ) base -= m[i][j-i];
        if ( j >= i ){
     	   dp[i][j] = base;
     	   if ( i > 1 ) dp[i][j] += Math.min( dp[i-1][j], dp[i-1][j-1] );
        }
 	   }
    }
    
    writer.println( dp[N][N] );
    writer.close();
   }
}
