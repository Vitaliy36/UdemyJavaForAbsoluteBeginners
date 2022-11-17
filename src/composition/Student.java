package composition;

public class Student {
    private String name;
    private String dataOfBirth;
    private boolean hasStudentHousing;
    private Course course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public boolean hasStudentHousing() {
        return hasStudentHousing;
    }

    public void setStudentHousing(boolean hasStudentHousing) {
        this.hasStudentHousing = hasStudentHousing;
    }

    public void setCourse(Course course){
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }
}
