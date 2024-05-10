import java.util.*;
public class largest_number_in_array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.print("enter the size: ");
        int n=sc.nextInt();
        System.out.println("enter elements for array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("elements of array is: ");
        for(int i=0;i<n;i++){
           System.out.println(arr[i]+" ");
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("the largest number is: ");
        System.out.print(max);
       
    }
    
}
    

