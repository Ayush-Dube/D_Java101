package methods;

public class MethodDemo {
	
	int[] arr1 = {11,22,33,44,55};
	int[] arr2 = {1,2,3,4,5};
	int[] arr3 = {10,20,30,40,50};
	
	int sumArray(int[] arr) {
		
		int res = 0;
		//enhanced loop
		for(int i :arr) {
			res +=i;			
		}
		return res;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodDemo demo = new MethodDemo();
		System.out.println(demo.arr1);
		System.out.println(demo.arr1[2]);
		System.out.println(demo.sumArray(demo.arr3));
		System.out.println(demo.sumArray(demo.arr1));
		System.out.println(demo.sumArray(demo.arr2));
		
		
		
		
		
		
		
		
		
	}

}
