public class Oops {
    public static void main(String args[]){
       pen p1=new pen();
       p1.setColor("blue");
       System.out.println(p1.getColor());
       p1.SetTip(5);
       System.out.println(p1.getTip());
    }
}
 class pen{
    private int tip;
    private String color;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void SetTip(int newTip){
        tip=newTip;
    }
    void setColor(String newColor){
        color=newColor;
    }
}
    

