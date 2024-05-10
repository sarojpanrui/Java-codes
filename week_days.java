import java.util.*;
public class week_days {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        switch(number){
            case 1:System.out.print("Monday");
                    break;
            case 2:System.out.print("tuesday");
                    break;
            case 3:System.out.print("wednesday");
                    break;
            case 4:System.out.print("thusday");
                    break;
            case 5:System.out.print("friday");
                    break;
            case 6:System.out.print("saturday");
                    break;
            case 7:System.out.print("sunday");
                    break;
            default:System.out.print("enter number between 1 to 7");
        }
    }
}
