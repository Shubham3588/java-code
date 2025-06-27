package Array;

public class minAndMaxOfArray {

	public static void main(String[] args) {
		int[] arr = {6,7,73,9,5,4};
		
		int min = arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]<min) {
				min = arr[i+1];
			}
			else if(arr[i+1]>max) {
				max = arr[i+1];
				
			}
		
		}
		System.out.println("Min:"+min);
		System.out.println("Max:"+max);

	}

}
