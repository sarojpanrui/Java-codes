import java.util.*;
public class x_power_n {
public static int power(int x,int n){
    if(n==0){
        return 1;
    }
    return x* power(x,n-1);
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the value of x: ");
    int x=sc.nextInt();
    System.out.print("enter the value of n: ");
    int n=sc.nextInt();
    int val=power(2, 10);
    System.out.print(val);
}
    
}
