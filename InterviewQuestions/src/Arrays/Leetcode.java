package Arrays;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;

public class Leetcode {

//	
//	Date d = new Date();
//	GregorianCalendar cal = new GregorianCalendar();
//	cal.setTime(d);
	
	Calendar c=new GregorianCalendar();
	 //BEST TIME TO BUY AND SELL STOCK (LeetCode)
	public int bestTimeToBuy(int[] prices) {
		int maxProfit=0;
		int minValue=Integer.MAX_VALUE;
		
		for(int i=0;i<prices.length;i++) {
			
			if(prices[i] < minValue) {
				
				minValue=prices[i];
			} else if(prices[i]-minValue > maxProfit ) {
				
				maxProfit=prices[i]-minValue;
			}
		}
		
		return maxProfit;
		
		
	}
	
	
	
	
	public static final String DATE_PATTERN="mm/dd/yyyy";
	public static LocalDate dateTimeForString(String date) {
		
		return LocalDate.parse(date, DateTimeFormatter.ofPattern(DATE_PATTERN));
	}
	
	public static String localDateAsString(LocalDate date) {
		
		return date.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
	}
	
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
		 
		 
	 }
	 


	

}
