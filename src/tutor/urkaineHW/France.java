package tutor.urkaineHW;

public class France extends Human {

    String famousFor;

    public France(String language, String nationalDish, double territory, double population, int alphabetLetters, String famousFor) {
        super(language, nationalDish, territory, population, alphabetLetters);
        this.famousFor = famousFor;
    }

    public String hello() {
        return "French language is " + language + ",  national dish is " + nationalDish + ", the alphabet has "
                + alphabetLetters + " letters. Territory of France is " + territoryKM2 + ", and population is " + population
                + ". France is famous for " + famousFor;
    }
}
