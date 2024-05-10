import java.util.*;
public class primeinrange {
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
    public static int primeinrange(int n){
        for(int i=2;i<=n-1;i++){
           if(isPrime(i)){
                System.out.print(i);
           }
          

        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=sc.nextInt();
        Primeinrange(a);
        }
}
