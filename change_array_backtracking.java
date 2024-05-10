public class change_array_backtracking {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void changearr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            printarr(arr);
            return;
        }
        //recursion case
        arr[i]=val;
        changearr(arr,i+1,val+1);
        arr[i]=val-2;
    }
    public static void main(String arr[]){
        int ar[]=new int[5];
        changearr(ar, 0, 1);
        System.out.println();
        printarr(ar);
    }
    
}
