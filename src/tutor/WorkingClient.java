package tutor;

public class WorkingClient extends Client {

    Double salary;

    public WorkingClient(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

//    public WorkingClient(String name, int age) {
//        super(name, age);
//        this.name = "No name";
//    }

    public String hello() {
        return "Hello my name is: " + this.name + " I'm " + this.age + " years old " + "my salary is " + this.salary;
    }

}
