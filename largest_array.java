import java.util.*;

public class largest_array {
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[] ){
            int numbers[]={1,2,6,9,5};
            int largest=getLargest(numbers);
            System.out.print(largest);
    }
    
}
