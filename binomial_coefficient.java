import java.util.*;
public class binomial_coefficient {
    public static int binomialcoefficient(int n,int r,int div){
            int nf=1;
            for(int i=1;i<=n;i++){
                    nf=nf*i;
            }
            System.out.println(nf);
            int rf=1;
            for(int j=1;j<=r;j++){
                rf=rf*j;
            }
            System.out.println(rf);
            int divf=1;
            for(int k=1;k<=div;k++){
                divf=divf*k;
            }
            System.out.println(divf);
            int c=(rf)*(divf);
            System.out.println(c);
            int bi_co=nf/c;
    }
    
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the value of n");
            int n=sc.nextInt();
            System.out.println("enter the value of r");
            int r=sc.nextInt();
            int div=(n-r);
            System.out.println(div);
            int nf=1;
            for(int i=1;i<=n;i++){
                    nf=nf*i;
            }
            System.out.println(nf);
            int rf=1;
            for(int j=1;j<=r;j++){
                rf=rf*j;
            }
            System.out.println(rf);
            int divf=1;
            for(int k=1;k<=div;k++){
                divf=divf*k;
            }
            System.out.println(divf);
            int c=(rf)*(divf);
            System.out.println(c);
            int bi_co=nf/c;
            System.out.print("The value of Binomial coefficient is="+bi_co);

    }
    
}
