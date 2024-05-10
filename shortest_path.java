public class shortest_path {
    public static float getshortestpath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='s'){
                y--;
            }
            if(dir=='n'){
                y++;
            }
            if(dir=='w'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2=(x*x);
        int y2=(y*y);
        return (float)(Math.sqrt(x2+y2));
    }
    public static void main(String args[]){
        String path="wneenesennn";
       
        System.out.print( getshortestpath(path));
    } 
    
}
