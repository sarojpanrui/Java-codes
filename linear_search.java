
public class linear_search{
    public static int linearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(key == numbers[i]){
                return i;
            }           
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,5,9};
        int key=5;
        int pos=linearsearch(numbers,0);
        if(pos == -1){
            System.out.print("not found");
        }
        else{
            System.out.print("item found in: "+pos);
        }


    }
}