public class interfaces {
    public static void main(String args[]){
            queen q=new queen();
            q.moves();
    }    
}
interface chessplayer{
    void moves();
}
class queen implements chessplayer{
    public void moves(){
        System.out.println("left,right,up,down,diagonally");
    }
}
class horse implements chessplayer{
     public void moves(){
        System.out.println("left,right,up,down,diagonally-(by 2.5)");
    }
}