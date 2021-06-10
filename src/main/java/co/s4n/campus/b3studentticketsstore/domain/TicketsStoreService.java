package co.s4n.campus.b3studentticketsstore.domain;

import co.s4n.campus.b3studentticketsstore.infraestructure.bank.BankOperations;
import co.s4n.campus.b3studentticketsstore.infraestructure.bank.CreditCard;
import co.s4n.campus.b3studentticketsstore.infraestructure.bank.PaymentRequest;
import co.s4n.campus.b3studentticketsstore.infraestructure.qrgenerator.QrCodeGeneratorOperations;

import javax.inject.Inject;

public class TicketsStoreService {

    @Inject
    private BankOperations bankOperations;

    @Inject
    private QrCodeGeneratorOperations qrCodeGeneratorOperations;

    public String buyEvent(TicketPurchaseRequest ticketPurchaseRequest, CreditCard creditCard){
        double amount = 10.0;
        String transactionId = bankOperations.pay(new PaymentRequest(creditCard, amount));
        return qrCodeGeneratorOperations.generate(ticketPurchaseRequest.getEventId()+":"+transactionId);
    }
}
