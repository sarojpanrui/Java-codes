public class polymorphism_method_overloading {
    public static void main(String args[]){
        calculator cal=new calculator();
        System.out.println(cal.sum(1,2));
        System.out.println(cal.sum(1,2,3));
        System.out.println(cal.sum((float)1.5,(float)2.5));
    }  
}
class calculator{
    int sum(int a,int b){
        return a+b;
    }
     int sum(int a,int b,int c){
        return a+b+c;
    }
     float sum(float a,float b){
        return a+b;
    }
}

