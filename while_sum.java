import java.util.*;
public class while_sum {
     public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.print("the sum is= "+ sum);

    }
    
}