package streamapi;

public record StudentRecord(String name, int cps, Enrollment program) {

    public StudentRecord {}

    @Override
    public String name() {
        return name;
    }


    @Override
    public int cps() {
        return cps;
    }


    @Override
    public Enrollment program() {
        return program;
    }


    public boolean isIFM() {
        return program == Enrollment.IFM;
    }

    @Override
    public String toString() {
        return "Student["
            + "name="
            + name
            + ", "
            + "cps="
            + cps
            + ", "
            + "program="
            + program
            + ']';
    }
}
