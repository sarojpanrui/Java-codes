import java.util.*;
public class bill {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float pen=sc.nextFloat();
        float pensil=sc.nextFloat();
        float eraser=sc.nextFloat();
        float bill=(pen+pensil+eraser);
        System.out.println("the bill is " + bill);
        float total=(bill+(bill*0.18f));
        System.out.println(total);

    }
    
}
