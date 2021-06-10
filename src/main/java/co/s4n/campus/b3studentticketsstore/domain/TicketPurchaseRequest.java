package co.s4n.campus.b3studentticketsstore.domain;

import java.util.UUID;

public class TicketPurchaseRequest {
    private String id;
    private String eventId;

    public TicketPurchaseRequest(String eventid) {
        this.id = UUID.randomUUID().toString();
        this.eventId = eventid;
    }

    public String getId(){
        return id;
    }

    public String getEventId() {
        return eventId;
    }
}
