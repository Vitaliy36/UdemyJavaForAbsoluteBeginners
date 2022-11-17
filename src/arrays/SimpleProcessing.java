package arrays;

public class SimpleProcessing {
    public static void main(String[] args) {
        int[] nums = {75, 29, 350, 7, 204, 1100, 67};
        int count = 0;
        int sumOfNums = 0;

        for (int i = 0; i < nums.length; i++) {

            //Count all number over 100
            if(nums[i] > 100) {
                count++;
                System.out.println(nums[i]);

            }
            // Add up all numbers
            sumOfNums = sumOfNums + nums[i];
        }
        System.out.println("--------------------------------");
        System.out.println("Number of values greater than 100: " + count);
        double mean = (double)sumOfNums / nums.length;
        System.out.println("Mean: " + mean);
    }
}
