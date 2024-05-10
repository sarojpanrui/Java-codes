public class invertedhalf_rectangle {
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i;j++){//space
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){//star
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
