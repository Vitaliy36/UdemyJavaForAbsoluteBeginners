package tutor;

import java.util.Scanner;

public class CaiculatorHW {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first integer: ");
        int fInt = scanner.nextInt();
        System.out.print("Please enter second integer: ");
        int sInt = scanner.nextInt();
        System.out.println("------------------------------------");

        int addSum = add(fInt, sInt);
        System.out.println("The sum of add is: " + addSum);

        int subResult = subtract(fInt, sInt);
        System.out.println("The result of subtract is: " + subResult);

        int multResult = multiply(fInt, sInt);
        System.out.println("The result of multiply is: " + multResult);

        int divideResult = divide(fInt, sInt);
        System.out.println("The result of divide is: " + divideResult);


    }

    private static int add(int fAdd, int sAdd) {
        return fAdd + sAdd;
//        int sum = fAdd + sAdd;
//        return sum;
    }

    private static int subtract(int fSub, int sSub ) {
        int result = fSub - sSub;
        return result;
    }

    private static int multiply(int fMul, int sMul) {
        int result = fMul * sMul;
        return result;
    }

    private static int divide(int fDivide, int sDivide) {
        int result = fDivide / sDivide;
        return result;
    }

}
