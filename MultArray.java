import java.util.Scanner;
import java.util.Arrays;
public class MultArray {
   public static void main(String[] args)
   {
       int[] arr1 = {5,3,4,22,19,15};
       int[] arr2 = {7,3,2,4,6,19};
       int n = arr1.length;
       for(int i=0;i<n;i++)
       {
           if((arr1[i]%2!=0) && (arr2[i]%2!=0))
           {
               System.out.println(arr1[i]*arr2[i]);
           }
       }
   }
}
