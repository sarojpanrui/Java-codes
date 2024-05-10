public class array_as_argument {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
                marks[i]=marks[i]+1;
        }

    }
    public static void main(String args[]){
            int marks[]={1,2,3};
            for(int i=0;i<3;i++){
                System.out.print(marks[i]+" ");
            }
            System.out.println();
            update(marks);
            for(int i=0;i<3;i++){
                System.out.print(marks[i]+" ");

    }
    
}
}
