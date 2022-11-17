package tutor.urkaineHW;

public class USA extends Human {

    public int consistDifferentCountries;


    public USA(String language, String nationalDish, double territory, double population, int alphabetLetters, int consistDifferentCountries) {
        super(language, nationalDish, territory, population, alphabetLetters);
        this.consistDifferentCountries = consistDifferentCountries;


    }
    public String hello() {
        return "American language is " + language + ",  national dish is " + nationalDish + ", the alphabet has "
                + alphabetLetters + " letters. Territory of USA is " + territoryKM2 + ", and population is " + population
                + ". America is unique for " + consistDifferentCountries;
    }
}
