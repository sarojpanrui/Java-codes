import java.util.*;
public class string_pallindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        int n=word.length();
        int flag=0;
        for(int i=0;i<n/2;i++){
            if(word.charAt(i)==word.charAt(n-i-1)){
                flag= 1;
            }
        }
        if(flag==0){
            System.out.print("not pallindrome");
        }
        else{
            System.out.print("pallindrome");
        }
    }
}
