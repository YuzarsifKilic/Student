import java.util.Date;

public class GraduateStudent extends AbstractStudent {

    protected String advisor;
    protected String thesis;

    public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    @Override
    public void study() {
        System.out.println("Graduate Student studied");
    }

    @Override
    public void register() {
        System.out.println("Graduate Student registered");
    }

    public void writeThesis() {
        System.out.println("Graduate Student write thesis");
    }

    public void meetWithAdvisor() {
        System.out.println("Graduate Student meet with advisor");
    }
}
