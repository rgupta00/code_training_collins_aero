package day_1.basics;

import java.util.Arrays;

public class D_DemoArray2D {
	
	public static void main(String[] args) {
		int arr[][]={{2,4,5},{7,8,0}};
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		
//		for(int temp[]: arr){
//			for(int temp2: temp){
//				System.out.print(temp2+": ");
//			}
//			System.out.println("");
//		}
		
	}

}
