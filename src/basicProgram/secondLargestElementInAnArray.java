package basicProgram;

public class secondLargestElementInAnArray {
    public static void main(String[] args) {
        int arr[] ={2,5,3,7,8,11};
        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i=0;i<= arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                largest=arr[i+1];
                secondLargest=arr[i];
                
            }
        }
    }
}
