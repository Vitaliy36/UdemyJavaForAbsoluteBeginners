package tutor.urkaineHW;

public class Chat {

    Homosapien[] people;

    public Chat(Homosapien ...people) {
        this.people = people;
    }

    public static void main(String[] args) {
        Chat chat = new Chat(new He("Vova"), new He("Maxim"), new She("Olga"), new She("Marina"));
        for (int i = 0; i < 40; i++) {
            Homosapien speaker = chat.people[UserFactory.getRanNum(0, chat.people.length -1)];
            System.out.println(speaker.name + ": " + speaker.say());
        }
    }


}
