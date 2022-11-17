package arrays;

public class arrays {
    public static void main(String[] args) {
        int[] nums = {75, 29, 350, 7, 4192};
        System.out.println(nums[3]);
        nums[3] = 51;
        System.out.println(nums[3]);

        for (int i = nums.length -1; i >= 0; i--) {
            System.out.println(nums[i]);
        }

    }
}
