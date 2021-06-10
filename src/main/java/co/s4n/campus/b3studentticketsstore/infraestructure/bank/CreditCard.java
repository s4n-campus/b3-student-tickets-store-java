package co.s4n.campus.b3studentticketsstore.infraestructure.bank;

public class CreditCard {
    private String number;
    private String cvc;
    private ExpiresDate expiresDate;

    public CreditCard(String number, String cvc, ExpiresDate expiresDate) {
        this.number = number;
        this.cvc = cvc;
        this.expiresDate = expiresDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public ExpiresDate getExpiresDate() {
        return expiresDate;
    }

    public void setExpiresDate(ExpiresDate expiresDate) {
        this.expiresDate = expiresDate;
    }
}
