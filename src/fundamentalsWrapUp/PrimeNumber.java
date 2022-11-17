package fundamentalsWrapUp;

public class PrimeNumber {
    public static void main(String[] args) {

        for (int num = 2; num < 500000; num++) {
            boolean isPrime = true;

            for (int div = 2; div * div <= num; div++) { // div * div give us shorter run time when push run button

                if (num % div == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
