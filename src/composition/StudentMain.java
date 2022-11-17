package composition;
public class StudentMain {

    //Human has a brain
    //Employee has a manager
    //House has an address
    //Book has pages
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Joe Bloggs");
        student.setDataOfBirth("30/06/1998");
        student.setStudentHousing(true);
        student.setCourse(new Course());
        student.getCourse().setTitle("Computer Science");
        student.getCourse().setLevel("Undergraduate");
        student.getCourse().setStartDate("07/09/2021");

        System.out.println("Name: " + student.getName());
        System.out.println("DoB: " + student.getDataOfBirth());
        System.out.println("Housing: " + (student.hasStudentHousing() ? "yes" : "no"));
        System.out.println("The student " + student.getName() + " is enrolled on the "
                + student.getCourse().getTitle() + " course due to start on " + student.getCourse().getStartDate());


    }
}
