public class inverted_pattern {
    public static void main(String args[]){
        int line=4;
        char ch='A';
        for(line=1;line<=4;line++){
            for(int chas=1;chas<=line;chas++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
