public class abstraction {
    public static void main(String args[]){
        horse h=new horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        chicken c=new chicken();
        c.walk();
        c.eat();
    }
}
abstract class animal{
    String color;
    animal(){
        color="brown";
    }
    void eat(){
        System.out.println("eat");
    }
    abstract void walk();
}
class horse extends animal{
    void changecolor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class chicken extends animal{
    void walk(){
        System.out.println("walk on 2 legs");
    }
}