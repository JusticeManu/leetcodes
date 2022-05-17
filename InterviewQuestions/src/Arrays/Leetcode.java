package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Leetcode {

	
	
	///leettcode problem . find the number of island 
	
	
	public static int isIland(char[][] grip) {
		
		int count=0;
		
		for(int i=0;i<grip.length;i++) {
			for(int j=0;j<grip[0].length;j++) {
				
				if(grip[i][j]== '1') {
					count+=bfs(grip,i,j);
				}
			}
		}
		return 1;
	}
	
	public static int bfs(char[][] grip ,int i,int j) {
		
		if( i<0 || j<0 || grip.length<=0 || grip[0].length<=0 || grip[i][j]== '0') {
			
		 return 0;
		}
		
		grip[i][j]='0';
		bfs(grip,i+1,j);
		bfs(grip,i-1,j);
		bfs(grip,i,j+1);
		bfs(grip,i,j-1);
		
		return 1;
	}
	
	//// Pascal triabgle problem
	
	public List<List<Integer>> pascalTriangle(int numRows) {
		
		List<List<Integer>> triangle=new ArrayList();
		List<Integer> first_row=new ArrayList<Integer>();
		
		first_row.add(1);
		triangle.add(first_row);
		
		for(int i=0;i<numRows;i++) {
			List<Integer> getCurrentRow=triangle.get(i-1 );
			List<Integer> newRow= new ArrayList<>();
			
			newRow.add(1);
			
			for(int j=1;j<i;j++) {
				newRow.add(getCurrentRow.get(j-1)+getCurrentRow.get(j));
			}
			newRow.add(1);
			triangle.add(newRow);
		}
		
		return triangle;
	}
	 public boolean isDuplicate(int[] arr) {
		 Arrays.sort(arr);
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 if(arr[i]==arr[i+1]) return true;
		 }
		 return false;
		 
		 
//		 HashSet<Integer> numbers=new HashSet<>();
//				 
//				 for(int i=0;i<arr.length ; i++) {
//					 
//					 if(numbers.contains(arr[i])); return true;
//					 
//					 numbers.add(arr[i]);
//				 }
//		 return false;
	 }
	 
	 //other alternative
	 

}
