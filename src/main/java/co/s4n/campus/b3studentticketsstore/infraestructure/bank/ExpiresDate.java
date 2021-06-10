package co.s4n.campus.b3studentticketsstore.infraestructure.bank;

public class ExpiresDate {
    private String year;
    private String month;

    public ExpiresDate(String year, String month) {
        this.year = year;
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
