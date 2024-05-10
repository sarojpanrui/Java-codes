import java.util.*;
public class prime_function {
    public static void isPrime(int n){
           int flag=0;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("prime");

            }
            else{
                System.out.println(" not prime");
            }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=sc.nextInt();
        isPrime(a);
        }
}