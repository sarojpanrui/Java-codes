public class largest_string {
public static void main(String args[]){
        String fruit[]={"mango","banana","apple"};
        String largest=fruit[0];
        for(int i=0;i<fruit.length;i++){
                if(largest.compareTo(fruit[i])<0){
                    largest=fruit[i];
                }
        }
        System.out.print(largest);
    
    }
}