public class invertade_pattern {
    public static void main(String args[]){
            int n=4;
            int line;
            for(line=1;line<=n;line++){
                for(int star=1;star<=n-line+1;star++){
                    System.out.print("*");
                }                
                System.out.println();
            }
        }
} 
