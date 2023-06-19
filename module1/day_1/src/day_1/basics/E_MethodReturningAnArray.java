package day_1.basics;

public class E_MethodReturningAnArray {
	
	public static void main(String[] args) {
		
		int arr[][]={{2,4,5},{7,8,0}};
		
		int arr2[][]=getDoubled2DArray(arr);
		
	}
	
	public static int [][] getDoubled2DArray(int arr[][]){
		//logic to double each element
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=2*arr[i][j];
			}
		}
		return arr;
	}

}
