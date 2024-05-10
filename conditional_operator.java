import java.util.*;
public class conditional_operator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("adult");
        }
        if(age>13 && age<18){
            System.out.print("teenager");
        }

        else{
            System.out.println("not adult");
        }
        }
        
    }
    

