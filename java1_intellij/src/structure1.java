public class structure1 {
    private int id;
    private BIRTHDATE birthdate;

    public structure1(int ssn, int year,int month, int day) {
        id = ssn;
        birthdate = new BIRTHDATE(year, month, day);
    }

    public int getId() {
        return id;
    }

    public BIRTHDATE birthdate() {
        return birthdate;
    }
}
