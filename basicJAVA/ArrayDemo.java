public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Elements at index %d : %d \n", i, numbers[i]);
        }

        int sum = 0;

        for (int i : numbers) {
            sum += i;
        }
        System.out.println("The sum of the elements is : " + sum);

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else {
                continue;
            }
        }
        System.out.println("The maximum value in the array is: " + max);

        numbers[2] = 10;
        System.out.println("\nAfter modifying the third element:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

    }
}
