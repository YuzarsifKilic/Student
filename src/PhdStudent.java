import java.util.Date;

public class PhdStudent extends GraduateStudent {

    protected boolean qualifyingExamToken;

    public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, boolean qualifyingExamToken) {
        super(no, name, year, dob, major, advisor, thesis);
        this.qualifyingExamToken = qualifyingExamToken;
    }

    @Override
    public void study() {
        System.out.println("Phd Student studied");
    }

    @Override
    public void register() {
        System.out.println("Phd Student registered");
    }

    @Override
    public void writeThesis() {
        System.out.println("Phd Student write thesis");
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("Phd Student meet with advisor");
    }

    public void writePaper() {
        System.out.println("Phd Student write paper");
    }
}
