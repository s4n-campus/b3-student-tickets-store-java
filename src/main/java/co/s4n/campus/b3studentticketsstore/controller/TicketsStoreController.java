package co.s4n.campus.b3studentticketsstore.controller;


import co.s4n.campus.b3studentticketsstore.domain.TicketPurchaseRequest;
import co.s4n.campus.b3studentticketsstore.domain.TicketsStoreService;
import co.s4n.campus.b3studentticketsstore.infraestructure.bank.BankTransformers;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.reactivex.Single;

import javax.inject.Inject;

@Controller("/student-tickets-store")
public class TicketsStoreController {

    @Inject
    private TicketsStoreService ticketsStoreService;

    @Post("/buy-event")
    public Single<HttpResponse<String>> buyEvent(@Body Single<BuyEventRequest> buyEventRequest){
        return buyEventRequest.map(ber -> {
            TicketPurchaseRequest ticketPurchaseRequest = new TicketPurchaseRequest(ber.getEventId());
            return HttpResponse.ok(ticketsStoreService.buyEvent(ticketPurchaseRequest, BankTransformers.getCreditCardfromByRequest(ber)));
        });
    }
}
