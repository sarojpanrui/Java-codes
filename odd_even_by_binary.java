public class odd_even_by_binary {
    public static void oddeven(int n){
        int bitmarks=1;
        if((n & bitmarks)==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String args[]){
            oddeven(3);
             oddeven(4);
              oddeven(9);
}
}
