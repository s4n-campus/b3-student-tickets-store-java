package co.s4n.campus.b3studentticketsstore.infraestructure.bank;

public class PaymentRequest {
    private CreditCard creditCard;
    private Double amount;

    public PaymentRequest(CreditCard creditCard, Double amount) {
        this.creditCard = creditCard;
        this.amount = amount;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
