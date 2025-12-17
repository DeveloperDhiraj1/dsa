public class Reverse1 {
    public static void main(string[] args){
        int arr[]={24,56,2,3,12};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }

    }
}
