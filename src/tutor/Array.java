package tutor;

public class Array {
    public static void main(String[] args) {

        int[] num = {2, 20, 10, 11, 58, 79, 1, 4, 44};
        int max = maxNum(num);
        Array array = new Array();
        int result = array.sum(num);
        System.out.println("Max number is: " + max);
        System.out.println("Sum all numbers is: " + result);

    }

    private static int maxNum(int[] num) {
        int maxN;
        maxN = num[0];

        for (int i = 1; i < num.length; i++) {
            if (maxN < num[i]) {
                maxN = num[i];
            }
        }
        return maxN;

    }

    private int sum(int[] sumNum) {
        int sumN = 0;

        for (int i = 0; i < sumNum.length; i++) {
            sumN = sumN + sumNum[i];
        }
        return sumN;
    }


}
