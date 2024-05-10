import java.util.*;
public class product_function {
    public static int product(int a,int b){
            int pro=a*b;
            System.out.print("The value of product is="+pro);
            return pro;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        product(a,b);
    }
    
}
