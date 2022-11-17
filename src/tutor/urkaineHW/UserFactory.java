package tutor.urkaineHW;

public class UserFactory {

    public static String[] language = {"Ukrainian", "English", "France", "Russian"};
    public static String[] nationalDish = {"Borsch", "Burger", "Croissants", "Vodka"};
    public static Double[] territoryKM2 = {603.550, 9.629091, 17.098246, 643.801};
    public static Double[] population = {44.130000, 329.500000, 67.390000, 144.100000};
    public static Integer[] alphabetLetters = {33, 26, 26, 32};
    public static String[] goals = {"Independent", "Free spirit", "Peace"};
    public static String[] uniqueFor = {"Free spirit", "Nice People", "Beautiful country"};

//    public static String[] names = {"Vova", "Andriy", "Anna", "Max", "Olga"};
//    public static String[] hobby = {"Create", "Destroy", "Run", "Read", "Complain"};
//    public static String[] idols = {"Jesus Christ", "Pu..n", "Elvis Preslay", "Taras Shevchenko"};
//    // Create class human from this class another class has to inherit.
//    public static String[] objects = {Ukrainian.class.toString(), Russian.class.toString()};

    public static int getRanNum(int from, int to) {
        return (int) Math.round(Math.random() * to + from);
    }

    public static String getGoal() {
        int index = getRanNum(0, goals.length -1);
        return goals[index];
    }

    public static String getUnique() {
        int index = getRanNum(0, uniqueFor.length -1);
        return uniqueFor[index];
    }

    public static String getLanguage() {
        int indexLanguage = getRanNum(0, language.length -1);
        return language[indexLanguage];
    }

    public static String getNationalDish() {
        int indexNationalDish = getRanNum(0, nationalDish.length -1);
        return nationalDish[indexNationalDish];
    }

    public static Double getTerritoryKM2() {
        int indexTerritoryKM2 = getRanNum(0, territoryKM2.length -1);
        return territoryKM2[indexTerritoryKM2];
    }

    public static Double getPopulation() {
        int indexPopulation = getRanNum(0, population.length -1);
        return population[indexPopulation];
    }

    public static Integer getAlphabetLetters() { // чому Getter через Generate створив Integer з [], a IntelliJ показує що це помилка і хоче Integer??
        int indexAlphabetLetters = getRanNum(0, alphabetLetters.length -1);
        return alphabetLetters[indexAlphabetLetters];
    }

    public static void main(String[] args) {
        Ukraine ukrainian = new Ukraine(getLanguage(), getNationalDish(), getTerritoryKM2(), getPopulation(), getAlphabetLetters(), getGoal(), getUnique());
        USA usa = new USA(getLanguage(), getNationalDish(), getTerritoryKM2(), getPopulation(), getAlphabetLetters(), 57);
        France france = new France(getLanguage(), getNationalDish(), getTerritoryKM2(), getPopulation(), getAlphabetLetters(), "Eiffel Tower");
        Russian russian = new Russian(getLanguage(), getNationalDish(), getTerritoryKM2(), getPopulation(), getAlphabetLetters());
        System.out.println(ukrainian.hello());
        System.out.println(usa.hello());
        System.out.println(france.hello());
        System.out.println(russian.hello());
    }

    //    private static String getRamName() {
//        int index = getRanNum(0, names.length -1);
//        return names[index];
//    }
//
//    private static String getRanHobby() {
//        int indexHobby = getRanNum(0, hobby.length -1);
//        return hobby[indexHobby];
//    }
//
//    private static String getRanIdol() {
//        int indexIdol = getRanNum(0, idols.length-1);
//        return idols[indexIdol];
//    }
//
//    //----------------------------------------
//    private static int salary() {
//        return getRanNum(10000, 100000);
//    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 20; i++) {
//            Ukrainian ukrainian = new Ukrainian(getRanHobby(), getRanHobby(), getRanNum(20, 34), getRanIdol(), "");
//            System.out.println(ukrainian.hello());
//        }
//    }

}
