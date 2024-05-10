import java.util.*;
public class reverse_array {
    public static void reverse(int numbers[]){
        int first=0,last=numbers.length-1;
        while(first<last){
            int temp=numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int numbers[]=new int[5];
       for(int i=0;i<5;i++){
           numbers[i]=sc.nextInt();
       }
        for(int i=0;i<5;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    
}
