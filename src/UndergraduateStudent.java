import java.util.Date;

public class UndergraduateStudent extends AbstractStudent {

    protected String minor;

    public UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
        super(no, name, year, dob, major);
        this.minor = minor;
    }

    @Override
    public void study() {
        System.out.println("Undergraduate Student studied");
    }

    @Override
    public void register() {
        System.out.println("Undergraduate Student registered");
    }

    @Override
    public String toString() {
        return "UndergraduateStudent{" +
                "minor='" + minor + '\'' +
                ", no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dob=" + dob +
                ", major='" + major + '\'' +
                '}';
    }
}
