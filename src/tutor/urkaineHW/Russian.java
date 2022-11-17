package tutor.urkaineHW;

public class Russian extends Human {

    String idol = "Pu..n";

    public Russian(String language, String nationalDish, double territory, double population, int alphabetLetters) {
        super(language, nationalDish, territory, population, alphabetLetters);


    }

    public String hello() {
        return "Russian language is " + language + ",  national dish is " + nationalDish + ", the alphabet has "
                + alphabetLetters + " letters. Territory of Russian is " + territoryKM2 + ", and population is " + population
                + ". Russian has an idol and it is " + idol;
    }


//    public Russian(String hobby, String dream, int alphabetLetters, String idol) {
//
//        this.hobby = hobby;
//        this.dream = dream;
//        this.alphabetLetters = alphabetLetters;
//        this.idol = idol;
//    }
//
//    public String hello() {
//            return "I am Russian. My hobby is " + hobby + " I am dreaming about " + dream + " my alphabet has "
//                    + alphabetLetters + " letters, my idol is " + idol;
//
//    }
}
