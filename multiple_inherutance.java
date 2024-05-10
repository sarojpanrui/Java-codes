public class multiple_inherutance {
    public static void main(String args[]){
            dog d1=new dog();
            d1.eat();
            d1.legs=4;
            System.out.println(d1.legs);
            d1.breath();
    }  
}
class animal{
    String color;
    void eat(){
        System.out.println("eat");
    }
     void breath(){
        System.out.print("breath");
    }
}
class mammal extends animal{
    int legs;
}
class dog extends mammal{
    String breed;
}

