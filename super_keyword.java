public class super_keyword {
    public static void main(String args[]){
        horse h=new horse();
        System.out.println(h.color);
        
    } 
}
class animal{
    String color;
   animal(){
    System.out.println("animal constractor is called");
   }
}
class horse extends animal{ 
    horse(){
        super.color="brown";
        System.out.println("horse constractor is called");
    }
}
