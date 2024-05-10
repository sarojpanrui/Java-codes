import java.util.*;
public class stone_paper_game {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        // menu
        System.out.println("0 : ROCK");
        System.out.println("1 : PAPER");
        System.out.println("2 : SCISSOR");

        //VARIABLE DECLEAR
        int computer_choice;
        int computerwon=0;
        int my_choice;
        int me=0;
        int game=1;

        //loop makeing
        while(game<=5){
            Random rand=new Random();

            computer_choice=rand.nextInt(2);

            my_choice=sc.nextInt();

            switch(my_choice){
                case 0:
                    System.out.println("YOU CHOOSE ROCK");
                    break;
                case 1:
                    System.out.println("YOU CHOOSE PAPER");
                    break;
                case 2:
                    System.out.println("YOU CHOOSE SCISSOR");
                    break;
            }

            switch(computer_choice){
                case 0:
                    System.out.println("COMPUTER CHOOSE ROCK");
                    break;
                case 1:
                    System.out.println("COMPUTER CHOOSE PAPER");
                    break;
                case 2:
                    System.out.println("COMPUTER CHOOSE SCISSOR");
                    break;
            }

           

            if(computer_choice==my_choice){
                System.out.println("MATCH DRAW");
            }
            else if(computer_choice==0 && my_choice==1){
                System.out.println("I WON!!! ");
                me++;
            }
            else if(computer_choice==1 && my_choice==2){
                System.out.println("COMPUTER WON!!!");
                computerwon++;
            }
            else if(computer_choice==1 && my_choice==0){
                System.out.println("COMPUTER WON!!!");
                computerwon++;
            }
            else if(computer_choice==1 && my_choice==2){
                System.out.println("I WON!!!");
                me++;
            }
            else if(computer_choice==2 && my_choice==0){
                System.out.println("I WON!!!");
                me++;
            }
            else if(computer_choice==2 && my_choice==1){
                System.out.println("COMPUTER WON!!!");
                computerwon++;
            }
            if(game==5){
                break;
            }
            game++;
        }
        
        System.out.println("----------------------------------");

        System.out.println("COMPUTER" + ":"+computerwon);
        System.out.println("ME" + ":"+me); 

        System.out.println("----------------------------------");

        if(computerwon>me){
            System.out.println("COMPUTER WON THE GAME");
        }
        else if(computerwon==me){
            System.out.println("MATCH DRAW");
        }
        else{
            System.out.println("ME WON THE GAME");
        }
        

    }
}
