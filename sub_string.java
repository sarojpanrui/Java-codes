public class sub_string {
    public static String substring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;

    }
    public static void main(String args[]){
        String sr="hello world";
       System.out.print( substring(sr, 0, 5));

    }
}
