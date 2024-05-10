public class fibonaci_recursion {
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fb=fnm1+fnm2;
        return fb;
    }
    public static void main(String args[]){
        int n=5;
        //for(int i=0;i<n;i++){
            System.out.print(fib(n));
        //
    }
    }

