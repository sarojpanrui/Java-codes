public class sum_recursion {
    public static int calsum(int n){
        if(n==1){
            return 1;
        }
        int snm1=calsum(n-1);
        int sn=n+snm1;
        return sn;

    }
    public static void main(String args[]){
        int n=10;
        System.out.print(calsum(n));
    }
    
}
