package interviewTask;

public class HalfDiamante {
    public static void main(String[] args) {
        int n = 5;
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + "");
            }
            System.out.println();
        }

        for (int x = n -1; x > 0; x--) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + "");
            }
            System.out.println();

        }
    }
}
