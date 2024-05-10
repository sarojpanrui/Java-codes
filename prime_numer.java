import java.util.*;
public class prime_numer {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int a=0;
        for( i=2;i<n;i++){
            if(n%i==0){
                a=1;
            }
        }
            if(a==1){
                System.out.print("not prime!!");
            }
            else{
                System.out.print("prime");
            }

       
        
    }
}
