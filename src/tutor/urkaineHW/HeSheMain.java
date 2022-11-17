package tutor.urkaineHW;

public class HeSheMain {
    public static String[] nameN = {"Tom", "Ivan", "Clara", "Jane"};
    public static int[] ageA = {101, 25, 32, 67};
    public static String[] interest = {"Relationship", "Friend", "Business", "Fun"};
    public static String[] hobby = {"Sleeping", "Running", "Reading", "Nothing"};

    private static int getRanNum(int from, int to) {
        return (int) Math.round(Math.random() * to + from);
    }

//    public static String[] getNameN() {
//        int index = getRanNum(0, nameN.length -1);
//        return nameN[index];
//    }

    public static int[] getAgeA() {
        return ageA;
    }

    public static String[] getInterest() {
        return interest;
    }

    public static String[] getHobby() {
        return hobby;
    }
}
