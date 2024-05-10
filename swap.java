import java.util.*;
public class swap {
    public static void swap(int a,int b){

        int temp=a;
         a=b;
         b=temp;
         System.out.println(a);
         System.out.println(b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
       
         int temp=a;
         a=b;
         b=temp;
         System.out.println("a=" +a);
         System.out.println("b="+b);
    }
    
}
