package array;

public class ArrayMain {

	public static void main(String[] args) {

		int x = 1;
		int y = 2;
		int z = 3;
		// what if you had to store thousands of such variables;

		int a = 11, b = 22, c = 33;

//		System.out.printf("%d %d %d %d %d %d",x,y,z,a,b,c);

		/*
		 * int[] arrayName = {1,2,3,4,5};
		 * 
		 * array is collection of similar data(dataType).
		 * 
		 * arrayName has the reference address --> 0xBD4XM
		 * 
		 */

		int[] arr = { 1, 2, 3, 4, 5 };

		int arr1[] = { 11, 22, 33, 44, 55 };

		System.out.println(arr[0]);

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + "-");
		}

		// for each
		for (int i : arr) {
			System.out.println(i);
		}

		int i = 0;
		while (i < arr1.length) {
			// i++
			System.out.println(arr1[i]);
			i++;
		}
		// the reason we do not prefer while and do while for array traversing is that
		// you can not use i again
		// whereas if u use a for loop , the i variables scope is local and does not
		// effect thee rest of the code .

		for (int k : arr1) {
			if (k % 2 == 0) {
				System.out.println(k + " ;");
			} else {
				continue;
			}
		}

		// reverse array
		for (int k = arr1.length - 1; k >= 0; k--) {
			System.out.println("-" + arr1[k]);
		}

		// sum
		int sum = 0;
		for (int e : arr1) {
			sum += e;
		}
		System.out.println(sum);
		System.out.println("---------------");

		int[] oneD = new int[3];
		// datatype variableName = new dattype[sizeParameter];
		// sets the default value to each item with 0 .
		System.out.println(oneD);

		for (int e : oneD) {
			System.out.println(e);
		}

		System.out.println("---------------");
		int[] oneD1 = { 123, 4, 133, 43, -23, 4, 0, -2312312, 1234 };
		int res = Integer.MIN_VALUE;// minus infinity;

		for (int e : oneD1) {
			if (res < e) {
				res = e;
			} else {
				continue;
			}
		}

		System.out.println(res);

		// 2d array
		// use square brackets Twice.

		int[][] twoD = new int[3][3];
		//[][] datatype pr hi double bracket .  =>[row][column]

		System.out.println(twoD);
		System.out.println(twoD[1][1]); //prints zero because default value set to zero .
		
		
		char[][] charArr = new char[2][3];
		
		System.out.println(charArr[1]);//prints nothing ,because default value is Null, for char datatype.
		//\u0000 (null char, not "null")
		
		
		//observe the blank line  in the output terminal 
		System.out.println(charArr);
		
		charArr[0][0]='j';
		charArr[0][1]='v';
		charArr[0][2]='m';
		charArr[1][0]='j';
		charArr[1][1]='r';
		charArr[1][2]='e';
		
		for(char[] e:charArr) {
			System.out.println(e);
		}
		
		//Jagged Array
		//keep the last [] empty 
		
	}

}
