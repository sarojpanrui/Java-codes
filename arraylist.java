import java.util.ArrayList;
public class arraylist {
    public static void main(String args[]){
        ArrayList<Integer>List=new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        System.out.println(List);
        int n=List.get(1);
        System.out.println(n);
        List.remove(4);
        System.out.println(List);
        List.set(2, 5);
        System.out.println(List);
        System.out.println(List.contains(4));
        for(int i=List.size()-1;i>=0;i--){
            System.out.print(List.get(i)+"  ");
        }
    }
}
