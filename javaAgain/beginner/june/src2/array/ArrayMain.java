package array;

public class ArrayMain {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;
		int z = 3;
		
		int a = 11,b = 22,c = 33;
		
//		System.out.printf("%d %d %d %d %d %d",x,y,z,a,b,c);
		
		/*
		 *     int[] arrayName = {1,2,3,4,5};
		 *    
		 *     array is collection of similar data(dataType).
		 *     
		 *     arrayName has the reference address --> 0xBD4XM
		 *     
		 */
		
		int[] arr = {1,2,3,4,5};
		
		int arr1[] = {11,22,33,44,55};
		
		System.out.println(arr[0]);
		
		for(int i =0;i<arr1.length;i++) {
			System.out.println(arr1[i]+"-");
		}
		
		//for each 
		for(int i:arr) {
			System.out.println(i);
		}
		
		int i =0;
		while(i<arr1.length) {
			//i++
			System.out.println(arr1[i]);
			i++;
		}
		//the reason we do not prefer while and do while for array traversing is that you can not use i again 
		//whereas if u use a for loop , the i variables scope is local and does not effect thee rest of the code .
		
		
		
		
		
		
		

	}

}
