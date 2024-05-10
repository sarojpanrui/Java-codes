import java.util.*;
public class factorial_fun {
    public static int fact(int a){
        
        int facto=1;
            for(int i=1;i<=a;i++){
                facto=facto*i;
            }
            return facto;
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value u want");
            int num=sc.nextInt();
            int fac=fact(num);
            System.out.println("the value of Factorial is="+fac);
            }

    }
    

