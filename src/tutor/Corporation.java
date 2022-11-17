package tutor;

public class Corporation {
    public static void main(String[] args) {
        // This example is polymorphism
        Client[] clients = new Client[3];
        clients[0] = new Client("Vova", 25);
        clients[1] = new Client("Mike", 55);
        clients[2] = new WorkingClient("Jesica", 37, 120.000);

        for (int i = 0; i < clients.length; i++) {
            System.out.println(clients[i].hello());
        }
    }
}
