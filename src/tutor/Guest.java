package tutor;

public class Guest {
    public String name;
    public String phone;

    public Guest(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public boolean equals(Guest guest) {
        if (this.hashCode()!= guest.hashCode() && this.hashCode2()!= guest.hashCode2()) {
            return false;
        }
        if (!this.name.equals(guest.name)) {
            return false;
        }
        if (!this.phone.equals(guest.phone)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.name.length();
    }
    public boolean hashCode2() {
        return this.phone.startsWith("+380");
    }

    public static void main(String[] args) {
        Guest guest1 = new Guest("Jane", "+13034567894");
        Guest guest2 = new Guest("Tom", "+380935673452");
        Guest guest3 = guest2;
     //   Guest guest4 = guest2.clone();
        Guest guest5 = new Guest("Jane", "+13034567894");
        System.out.println(guest1.equals(guest2));
        System.out.println(guest1.equals(guest5));
        System.out.println(guest1.equals(guest1));
        System.out.println(guest2.equals(guest3));


    }
}
