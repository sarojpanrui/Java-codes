import java.util.*;

public class print_array{
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
           System.out.print(arr[i]+" ");
        }
    }
}