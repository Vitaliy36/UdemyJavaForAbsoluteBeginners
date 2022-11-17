package tutor;

public class Runner {

    // Do While
    public static void main(String[] args) {
        int num = 0;
        Executable[] tests = {new Task1(), new Task2(), new Task3()};
        int index = 0;
        boolean testResult = false;

//        do {
//            System.out.println(tests[index]);
//            testResult = true;
//            index++;
//        }
//        while (index < tests.length && testResult);

        while (index < tests.length && testResult) {
            testResult = tests[index].execute();

            System.out.println(testResult);
            index++;
        }
    }
}
