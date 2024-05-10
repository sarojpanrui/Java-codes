public class Constractor {
    public static void main(String args[]){
            student s1=new student("saroj");
            System.out.println(s1.name);
    }
    
}
class student{
    String name;
    int roll;

    student(String name){
        this.name=name;
    }

}
