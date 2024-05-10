public class static_keyword {
    public static void main(String args[]){
        student s1=new student();
        s1.roll=1;
        s1.setname("saroj");
        System.out.println(s1.name);
        s1.schoolName="abc";
        System.out.println(s1.schoolName);
        System.out.println(s1.roll);
        student s2=new student();
        System.out.println(s2.schoolName);

    } 
}
class student{
    int roll;
    String name;
    void setname(String name){
        this.name=name;
    }
    static String schoolName;
}
