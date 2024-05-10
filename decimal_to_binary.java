public class decimal_to_binary {
    public static void main(String args[]){
        int binum=0;
        int pow=0;
        int decnum=7;
        int rem=0;
        while(decnum>0){
            rem=decnum%2;
            binum=binum+(rem*(int)Math.pow(10,pow));
            pow++;
            decnum/=2;
        }
        System.out.print(binum);
    }
}
