import java.util.ArrayList;
import java.util.Collections;
public class max_in_al {
    public static void main(String args[]){
        ArrayList<Integer>List=new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(9);
        List.add(4);
        List.add(5);
        System.out.println(List);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=List.size()-1;i++){
            if(max<List.get(i)){
                max=List.get(i);
            }
        }
        System.out.println("maximun element is= "+max);
        Collections.sort(List);//for asending order
        System.out.println(List);
        Collections.sort(List,Collections.reverseOrder());//for desending order
        System.out.print(List);
    }
        
}

