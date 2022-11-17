package tutor.urkaineHW;

public class Homosapien {

    String name;

    public Homosapien(String name) {
        this.name = name;
    }

    String[] phrase = {"Hi, how are you", "How old are you", "Do you have any hobby", "What is your favorite movie?",
                        "Are you fan of Cabs team"};

    public String say() {
        String[] phrase = this.getPhrase();
        int index = UserFactory.getRanNum(0, phrase.length - 1);
        return phrase[index];
    }

    public String[] getPhrase() {
        return phrase;
    }

}
