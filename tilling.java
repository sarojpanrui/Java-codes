public class tilling {
    public static int tilling(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1=tilling(n-1);
        int fnm2=tilling(n-2);
        int totalways=fnm1+fnm2;

        return totalways;
    }
    public static void main(String args[]){
            System.out.print(tilling(3));
    }
    
}
