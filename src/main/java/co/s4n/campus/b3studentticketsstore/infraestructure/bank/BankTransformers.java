package co.s4n.campus.b3studentticketsstore.infraestructure.bank;

import co.s4n.campus.b3studentticketsstore.controller.BuyEventRequest;

public class BankTransformers {

    public static CreditCard getCreditCardfromByRequest(BuyEventRequest buyEventRequest){
        return new CreditCard(buyEventRequest.getCard(), buyEventRequest.getCvc(), new ExpiresDate(buyEventRequest.getExpiresDate().substring(0,2), buyEventRequest.getExpiresDate().substring(2)));
    }
}
