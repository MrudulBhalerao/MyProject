package practice;

public class findMissingNumber {
	
	public static void main(String[] args) {
		
		//find the missing number
		
		int[] ar = {1,2,3,4,5,7,8,9};
		
		int sum=0,num=9,add=0;
		
		for(int j=1;j<=num;j++) {
			add+=j;
			
		}
		//System.out.println(add);
		
		for(int i=0;i<ar.length;i++) {
			sum+=ar[i];
			
		}
		
		int missing=add-sum;
		System.out.println(missing);
	}
}
