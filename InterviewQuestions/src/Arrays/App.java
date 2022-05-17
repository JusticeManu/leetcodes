package Arrays;

import java.util.Arrays;

public class App   {
	
	
	public static void rotateArray(int[][] matrix) {
		for(int i=0;i< matrix.length;i++) {
			for(int j=i ;j < matrix[0].length ;j++) {
				
				if( i != j) {
					int temp=matrix[i][j];
					matrix[i][j]=matrix[j][i];
					matrix[j][i]=temp;
				}
			}
		}
		//number of rows
		int R=matrix.length;
		//number of columns matrix.length
		int C=matrix[0].length;
		for(int i=0; i< R; i++) { 
			for(int j=i ; j < C/2 ; j++ ) {	
				int temp=matrix[i][j];
				matrix[i][j]=matrix[i][C-1-j];
				matrix[i][C-1-j]=temp;
			}
		}	
	}
	
	
	
	public static int[] sumEqualTarget(int[] arr,int target) {
		
		for(int i=0;i<=arr.length;i++) {
			
			for(int j=1;j<arr.length-1;j++) {
				
				if(arr[i]+arr[j] == target) {
					
					return new int[] {i,j};
				}
			}
		}
		
		throw new IllegalArgumentException("No number found");
		
	}
	
	public static int findMissingNumber(int[] arr) {
		
		int sum=0;
		int sum1=0;
		
		
		for(int num: arr) {
			sum+=num;
		}
		
		sum1= 10*(10+1)/2;
		
		int difference =sum1-sum;
		
		return  difference;
		
	}
	
	
	/// given two integer array find out if they are permutation
// they are permutation if the sum of arrays = sum of other array and products of array = product of second array
	
	
	public static boolean isPermutation(int[] arr1,int[] arr2) {
		
		
		int sum1=0;
		int sum2=0;
		int product1=1;
		int product2=1;
		
		for( int el : arr1 ) {
			
			sum1+=el;
			product1*=el;
		}
		
	for( int el : arr2 ) {
			
			sum2+=el;
			product2*=el;
		}
	
	if( sum1 == sum2 && product1 == product2) {
		
		return true;
	} 
	
	return false;
		
	}
	
	public static int maxProductInAnArray(int[] arr) {
		
		
		int temporalHighestNumber=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				
				int product=arr[i]*arr[j];
				if(  product > temporalHighestNumber) {
					
					temporalHighestNumber=product;
				}
					
			}
			
			
		}
		
		return temporalHighestNumber;  
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] array= {1,2,3,4,5,7,8};
//		int[] array1={1,2,6,5,7,3,8,9,10};
//		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
//		
//		
//		rotateArray(arr);
//		
//		System.out.print( Arrays.deepToString(arr));
//		
//		System.out.println( findMissingNumber(array)  );
//		System.out.println(isPermutation(array,array1));
		
		SingleLinkList list=new SingleLinkList();
		list.createSingleLinkedList(5);
		list.linkedList(3, 1);
		list.linkedList(8, 3);
		list.linkedList(5, 2);

	     list.transversal();

	}

}
