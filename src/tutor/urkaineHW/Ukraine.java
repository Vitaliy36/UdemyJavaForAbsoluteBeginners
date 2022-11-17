package tutor.urkaineHW;

public class Ukraine extends Human {

    public String goal = "Independent";
    public String uniqueFor = "Strong free spirit";
    // представники повинни бути

    public Ukraine(String language, String nationalDish, double territoryKM2, double population, int alphabetLetters, String goal, String uniqueFor) {
        super(language, nationalDish, territoryKM2, population, alphabetLetters);

        this.goal = goal;
        this.uniqueFor = uniqueFor;


    }

    public String hello() {
        return "Ukrainian language is " + language + ", national dish is " + nationalDish + ", alphabet has "
                + alphabetLetters + " letters. Territory of Ukraine is " + territoryKM2 + ", and population is " + population
                + " Ukraine is unique for " + uniqueFor + " and goal is " + goal;

    }


}
