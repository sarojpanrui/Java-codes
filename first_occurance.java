public class first_occurance {
    public static int firstOccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }
   public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,5,9};
    System.out.print(firstOccurance(arr, 5, 0));
   }
    
}
