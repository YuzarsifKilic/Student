import java.util.Date;

public class MasterStudent extends GraduateStudent {

    public MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major, advisor, thesis);
    }

    @Override
    public void study() {
        System.out.println("Master Student studied");
    }

    @Override
    public void register() {
        System.out.println("Master Student registered");
    }

    @Override
    public void writeThesis() {
        System.out.println("Master Student write thesis");
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("Master Student meet with advisor");
    }
}
