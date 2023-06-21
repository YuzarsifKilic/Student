import java.util.Date;

public class VocationStudent extends AbstractStudent {

    public VocationStudent(int no, String name, int year, Date dob, String major) {
        super(no, name, year, dob, major);
    }

    @Override
    public void study() {
        System.out.println("Vocation Student studied");
    }

    @Override
    public void register() {
        System.out.println("Vocation Student registered");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
