public class polimorphism_overriding {
    public static void main(String args[]){
            deer d1=new deer();
            d1.eat();
    }
}
class animal{
    void eat(){
        System.out.println("Eat anything");
    }
}
class deer{
    void eat(){
        System.out.println("Eat grass");
    }
}
