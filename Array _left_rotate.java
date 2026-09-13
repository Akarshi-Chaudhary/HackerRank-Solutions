 import java.util.*;
 
 public class Solution{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        // left rotate d times
        
        for(int i = 0; i < d; i++){
          // Store first element
            int first = arr[0];
        
             // Shift elements one position left
            for(int j = 0; j < n - 1; j++){     
                arr[j] = arr[j + 1];
            }
          
             // Put first element at the end
            arr[n-1] = first;
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
        
    }
 }
