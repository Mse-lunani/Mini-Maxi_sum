import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(long[] arr) {

        long sum [] = new long [5];
        
         for (int i = 0; i < 5; i++) {
             sum[i] = (LongStream.of(arr).sum()) - arr[i];
            
        }

    
    
    long max = 0;
    for (int j=0;j<5;j++){
        if (sum[j]>max){
            max= sum[j];
        }
    }
    long min = max;
for (int f=0;f<5;f++){
        if (sum[f]<min){
            min= sum[f];
        }
}
 System.out.println(min + "\t" + max );
    }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long[] arr = new long[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
