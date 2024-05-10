public class hierarchial_inheritance {
    public static void main(String args[]){
        fish f1=new fish();
        f1.eat();
        bird b1=new bird();
        b1.breath();
    } 
}
class animal{
    void eat(){
        System.out.println("eat");
    }
     void breath(){
        System.out.print("breath");
    }
}
class bird extends animal{
    void fly(){
        System.out.println("fly");
    }
}
class mammal extends animal{
    void walk(){
        System.out.println("walk");
    }
}
class fish extends animal{
    void swim(){
        System.out.println("swim");
    }
}
