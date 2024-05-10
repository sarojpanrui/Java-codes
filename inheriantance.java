public class inheriantance {
    public static void main(String args[]){
        fish shark=new fish();
        shark.eat();
    }
}
class animal{
    String color;
    void eat(){
        System.out.print("eat");
    }
     void breath(){
        System.out.print("breath");
    }
}
class fish extends animal{
    int fins;

    void swim(){
        System.out.print("swim");
    }
}
