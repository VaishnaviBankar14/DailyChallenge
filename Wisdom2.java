public class Wisdom2 {

    public static int missingNumber(int[] arr) {
        int n = arr.length + 1; 
        long totalSum = (long) n * (n + 1) / 2; 
        long arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        return (int)(totalSum - arrSum);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5};
        int[] arr2 = {2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4};
        int[] arr4 = {1};

        System.out.println("Missing number: " + missingNumber(arr1)); 
        System.out.println("Missing number: " + missingNumber(arr2));
        System.out.println("Missing number: " + missingNumber(arr3));
        System.out.println("Missing number: " + missingNumber(arr4));
    }
}
