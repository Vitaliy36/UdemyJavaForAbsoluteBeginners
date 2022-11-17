package tutor;

public class Client {

    public String name;
    public int age;


    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String hello() {
        return "Hello my name is: " + this.name + " I'm " + this.age + " years old ";
    }

    public static void main(String[] args) {
        Client client = new Client("Jon", 35);
        System.out.println(client.hello());
        WorkingClient workingClient = new WorkingClient("Jesica", 30, 35.000);
        System.out.println(workingClient.hello());
//        WorkingClient workingClient1 = new WorkingClient("Sam", 45);
//        System.out.println(workingClient1.hello());
    }


}
