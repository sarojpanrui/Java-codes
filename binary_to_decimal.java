public class binary_to_decimal {
    public static void main(String args[]){
        int pow=0;
        int binum=111;
        int decnum=0;
        while(binum>0){
            int lastdigit=binum%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binum/=10;
            

        }
        System.out.print(decnum);

    }
    
}
